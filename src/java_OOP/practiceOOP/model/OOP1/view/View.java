package java_OOP.practiceOOP.model.OOP1.view;

import java_OOP.practiceOOP.model.OOP1.controller.ControllerUtilities;
import java_OOP.practiceOOP.model.OOP1.controller.DataController;
import java_OOP.practiceOOP.model.OOP1.model.BRM;
import java_OOP.practiceOOP.model.OOP1.model.Book;
import java_OOP.practiceOOP.model.OOP1.model.Reader;


import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var dataController = new DataController();
        var controllerUtilities = new ControllerUtilities();
        var readers = new ArrayList<Reader>();
        var books = new ArrayList<Book>();
        var brms = new ArrayList<BRM>();
        var bookFileName = "BookFileName";
        var readerFileName = "ReaderFileName";
        var brmFileName = "BRMFileName";
        int choose;
        do {
            System.out.println("******************************MENU********************************");
            System.out.println("1.add a book from file");
            System.out.println("2.show list book from file");
            System.out.println("3.add a reader from file");
            System.out.println("4.show list reader from file");
            System.out.println("5.Contribute information BOOK");
            System.out.println("6.Sort Information for ask");
            System.out.println("7.Search By Name Reader");
            System.out.println("8.Search Book in file");
            System.out.println("0.exit");
            System.out.println("you choose");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 0: {
                    System.out.println("thank you use my service");
                    break;
                }
                case 1: {
                    checkBookId(dataController, bookFileName);
                    String bookName, author, specialization;
                    int year, quantity, spec;
                    System.out.println("input bookName");
                    bookName = scanner.nextLine();
                    System.out.println("input author");
                    author = scanner.nextLine();
                    //Science, Art, Economic, IT.
                    String[] spes = {"Science", "Art", "Economic", "IT."};
                    do {
                        System.out.println("1.Science\n2.Art\n3.Economic\n4.IT.");
                        spec = scanner.nextInt();
                        specialization = spes[spec - 1];
                    } while (spec < 1 || spec > 4);
                    System.out.println("input year of condition");
                    year = scanner.nextInt();
                    System.out.println("input quantity");
                    quantity = scanner.nextInt();
                    Book book = new Book(0, bookName, author, specialization, year, quantity);
                    dataController.writeBookToFile(book, bookFileName);
                    break;

                }
                case 2: {
                    System.out.println("************************Information for Book***************************");
                    books = dataController.readBookFromFile(bookFileName);
                    show(books);
                    break;
                }
                case 3: {
                    String fullName, address, phoneNumber;
                    System.out.println("Input name reader");
                    fullName = scanner.nextLine();
                    System.out.println("Input Address");
                    address = scanner.nextLine();
                    do {
                        System.out.println("input phoneNumber");
                        phoneNumber = scanner.nextLine();
                    } while (!phoneNumber.matches("\\d{10}"));
                    Reader reader = new Reader(0, fullName, address, phoneNumber);
                    dataController.writeReaderToFile(reader, readerFileName);
                    break;
                }
                case 4: {
                    System.out.println("************************Information Reader**********************");
                    readers = dataController.readReaderFromFile(readerFileName);
                    show(readers);
                    break;
                }
                case 5: {
                    //Book book, Reader reader, int numOfBorrow, String state, int total
                    books = dataController.readBookFromFile(bookFileName);
                    readers = dataController.readReaderFromFile(readerFileName);
                    brms = dataController.readBRMFromFile(brmFileName);
                    int booKID, readerID, numOfBorrow;
                    String state;
                    boolean checkBorrowBook = false;
                    boolean checkBorrowReader = false;
                    do {
                        System.out.println("*********************Information Reader From File************************");
                        show(readers);
                        System.out.println("input readerID");
                        readerID = scanner.nextInt();
                        if (readerID == 0) {
                            break;
                        }
                        checkBorrowReader = checkAllowReader(readerID, brms);
                        if (checkBorrowReader == true) {
                            break;

                        } else {
                            System.out.println("this person don't allow book over 15 books");
                        }
                    } while (true);

                    do {
                        System.out.println("*********************Information BooK From File************************");
                        show(books);
                        System.out.println("input bookID");
                        booKID = scanner.nextInt();
                        if (booKID == 0) {
                            break;
                        }
                        checkBorrowBook = checkAllowBook(readerID, booKID, brms);
                        if (checkBorrowBook == true) {
                            System.out.println("you borrow over 3 books for this bookID");
                        } else {
                            break;
                        }
                    } while (true);
                    int total = getTotal(readerID, booKID, brms);
                    do {
                        System.out.println("input numOfBorrow");
                        numOfBorrow = scanner.nextInt();
                        if ((numOfBorrow + total >= 1) && (numOfBorrow + total <= 3)) {
                            total += numOfBorrow;
                            break;
                        } else {
                            System.out.println("muon qua so luong quy dinh");
                        }
                    } while (true);
                    System.out.println("input state for book");
                    scanner.nextLine();
                    state = scanner.nextLine();
                    Reader currentReader = getReader(readers, readerID);
                    Book currentBook = getBook(books, booKID);
                    BRM brm = new BRM(currentBook, currentReader, total, state, 0);
                    brms = controllerUtilities.updateFile(brms, brm);//set lại những đối tượng trùng và thêm các đối tượng
                    //vào các danh sách
                    dataController.updateFile(brms, brmFileName);//ghi đối tượng trong danh sách ra file
                    show(brms);
                }
                case 6: {
                    brms = dataController.readBRMFromFile(brmFileName);
                    controllerUtilities.updateTotalOfBorrow(brms);
                    System.out.println("Information before sort");
                    show(brms);
                    do {
                        System.out.println("**********************SORT*********************");
                        System.out.println("1.Name Reader");
                        System.out.println("2.Total Borrow");
                        System.out.println("0.return MainMenu");
                        System.out.println("you choose!");
                        int x = scanner.nextInt();
                        if (x == 0) {
                            break;
                        }
                        switch (x) {
                            case 1: {
                                System.out.println("****************Information for Sort By Name*****************");
                                controllerUtilities.sortByName(brms);
                                show(brms);
                                break;
                            }
                            case 2: {
                                System.out.println("***************Information for Sort By Total*******************");
                                controllerUtilities.sortByTotal(brms);
                                show(brms);
                                break;
                            }
                        }
                    } while (true);
                }
                case 7: {
                    brms = dataController.readBRMFromFile(brmFileName);
                    var list = controllerUtilities.updateTotalOfBorrow(brms);
                    System.out.println("Nhap ten can tim kiem");
                    String key = scanner.nextLine();
                    var results = controllerUtilities.searchByName(list, key);
                    if (results.size() == 0) {
                        System.out.println("no find information to Search");
                    }
                    show(results);
                }
                case 8:{
                    books = dataController.readBookFromFile(bookFileName);
                    System.out.println("Nhap ten sach can tim");
                    String key = scanner.nextLine();
                    controllerUtilities.searchNameBook(books ,key);
                    break;
                }
            }
        } while (choose != 0);
    }

    private static Book getBook(ArrayList<Book> books, int booKID) {
        for (int i = 0; i < books.size(); ++i) {
            if (books.get(i).getBookId() == booKID) {
                return books.get(i);
            }
        }
        return null;
    }

    private static Reader getReader(ArrayList<Reader> readers, int readerID) {
        for (int i = 0; i < readers.size(); ++i) {
            if (readers.get(i).getReaderId() == readerID) {
                return readers.get(i);
            }
        }
        return null;
    }

    private static int getTotal(int readerID, int booKID, ArrayList<BRM> brms) {
        for (var x : brms) {
            if (x.getReader().getReaderId() == readerID && x.getBook().getBookId() == booKID) {
                return x.getNumOfBorrow();
            }
        }
        return 0;
    }

    private static boolean checkAllowBook(int readerID, int booKID, ArrayList<BRM> brms) {
        for (var brm : brms) {
            if (brm.getBook().getBookId() == booKID
                    && brm.getReader().getReaderId() == readerID && brm.getNumOfBorrow() == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkAllowReader(int readerID, ArrayList<BRM> brms) {
        int count = 0;
        for (var brm : brms) {
            if (brm.getReader().getReaderId() == readerID) {
                count += brm.getNumOfBorrow();
            }
        }
        if (count >= 15) {
            return false;
        } else {
            return true;
        }
    }

    private static void checkBookId(DataController dataController, String bookFileName) {
        var books = dataController.readBookFromFile(bookFileName);
        if (books.size() == 0) {
            //do nothing
        } else {
            Book.setId(books.get(books.size() - 1).getBookId() + 1);
        }
    }

    public static void show(ArrayList list) {
        for (var x : list) {
            System.out.println(x);
        }
    }

}
