package java_OOP.practiceOOP.model.OOP1.controller;

import java_OOP.practiceOOP.model.OOP1.model.BRM;
import java_OOP.practiceOOP.model.OOP1.model.Book;
import java_OOP.practiceOOP.model.OOP1.model.Reader;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataController {
    private Scanner scanner;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;

    public void openFileToWrite(String fileName){
        try {
            fileWriter = new FileWriter(fileName,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileAfterWrite(String fileName){

        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void writeBookToFile(Book book, String fileName){
        /*
        int bookId,String bookName, String author, String specialization,int year,int quantity
         */
        openFileToWrite(fileName);
        printWriter.println(book.getBookId()+"|"+book.getBookName()+"|"
                +book.getAuthor()+"|"+book.getSpecialization()+"|"+book.getYear()+"|"+book.getQuantity());
        closeFileAfterWrite(fileName);
    }

    public void writeReaderToFile(Reader reader, String fileName){
        //int readerId, String fullName, String address, String phoneNumber
        openFileToWrite(fileName);
        printWriter.println(reader.getReaderId()+"|"+reader.getFullName()+"|"+ reader.getAddress()+"|"+ reader.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }
    /*
    Book book, Reader reader, int numOfBorrow, String state, int total
     */
    public void writeBRMToFile(BRM brm, String fileName){
        openFileToWrite(fileName);
        printWriter.println(brm.getBook().getBookId()+"|"+brm.getReader().getReaderId()+"|"+brm.getNumOfBorrow()+"|"+brm.getState());
        closeFileAfterWrite(fileName);
    }
    //read
    public void openFileToRead(String fileName){
        try {
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeFileAfterToRead(String fileName){
        scanner.close();
    }
    public ArrayList<Book> readBookFromFile(String fileName){
        ArrayList<Book> books = new ArrayList<>();
        openFileToRead(fileName);
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            Book book = createBookDataFromFile(data);
            books.add(book);
        }
        closeFileAfterToRead(fileName);
        return books;
    }

    private Book createBookDataFromFile(String data) {
        //int bookId,String bookName, String author, String specialization,int year,int quantity
        String[]datas = data.split("\\|");
        Book book = new Book(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3],
                Integer.parseInt(datas[4]),Integer.parseInt(datas[5]));
        return book;
    }

    public ArrayList<Reader> readReaderFromFile(String fileName){
        ArrayList<Reader> readers = new ArrayList<>();
        openFileToRead(fileName);
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            Reader reader = createReaderDataFromFile(data);
            readers.add(reader);
        }
        closeFileAfterToRead(fileName);
        return readers;
    }
    private Reader createReaderDataFromFile(String data){
        /*
        int readerId, String fullName, String address, String phoneNumber)
         */
        String[]datas = data.split("\\|");
        Reader reader = new Reader(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3]);
        return reader;
    }
    public ArrayList<BRM> readBRMFromFile(String fileName){
        var readers = readReaderFromFile("ReaderFileName");
        var books = readBookFromFile("BookFileName");
        ArrayList<BRM> brms = new ArrayList<>();
        openFileToRead(fileName);
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            BRM brm = createBRMDataFromFile(data, books, readers);
            brms.add(brm);
        }
        closeFileAfterToRead(fileName);
        return brms;
    }

    private BRM createBRMDataFromFile(String data, ArrayList<Book> books, ArrayList<Reader> readers) {
        //Book book, Reader reader, int numOfBorrow, String state, int total
        String[] datas = data.split("\\|");
        BRM brm = new BRM(getBook(books,Integer.parseInt(datas[0])),
                getReader(readers,Integer.parseInt(datas[1])),Integer.parseInt(datas[2]),datas[3],0);
        return brm;
    }
    public void updateFile(ArrayList<BRM> brms, String fileName){
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
        for (var brm:brms) {
            openFileToWrite(fileName);
            printWriter.println(brm.getBook().getBookId()+"|"
                    +brm.getReader().getReaderId()+"|"+brm.getNumOfBorrow()+"|"+brm.getState());
            closeFileAfterWrite(fileName);
        }
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
}
