package java_OOP.practiceOOP.model.OOP1.model;

public class Book {
    /*
    Thông tin về Book gồm các thuộc tính (bookID, bookName, author, specialization, publishYear, quantity)
     – trong đó specialization có thể là: Science, Art, Economic, IT.
      bookID là một số nguyên có 6 chữ số, tự động tăng.
     */
    private int bookId;
    private String bookName;
    private String author;
    private String specialization;
    private int year;
    private int quantity;
    private static int id = 100000;

    public Book() {
    }

    public Book(int bookId) {
        this.bookId = bookId;
    }

    public Book(int bookId, String bookName, String author, String specialization, int year, int quantity) {
        if (bookId == 0) {
            this.bookId = id++;
        } else {
            this.bookId = bookId;
        }
        this.bookName = bookName;
        this.author = author;
        this.specialization = specialization;
        this.year = year;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", specialization='" + specialization + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                '}';
    }
}
