package java_OOP.practiceOOP.model.OOP1.model;

public class BRM {
    /*
    Thêm lớp BookReaderManagerment trong đó một Reader sẽ được phép mượn tối đa 5 đầu Book khác nhau,
    mỗi đầu Book tối đa 3 cuốn.
    Ghi rõ tình trạng hiện thời của Book khi mượn
     */
   private Book book;
   private Reader reader;
   private int numOfBorrow;
   private String state;
   private int total;

   public BRM(Book book){

   }
   public BRM(Reader reader){

   }
   public BRM(Book book, Reader reader, int numOfBorrow, String state, int total){
       this.book = book;
       this.reader = reader;
       this.numOfBorrow = numOfBorrow;
       this.state = state;
       this.total = total;
   }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BRM{" +
                "bookID=" + book.getBookId() +
                ", bookName=" + book.getBookName() +
                ", readerID=" + reader.getReaderId() +
                ", readerName=" + reader.getFullName() +
                ", numOfBorrow=" + numOfBorrow +
                ", state='" + state + '\'' +
                ", total=" + total +
                '}';
    }
}
