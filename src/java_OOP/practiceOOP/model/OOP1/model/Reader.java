package java_OOP.practiceOOP.model.OOP1.model;

public class Reader {
    /*
    Thông tin về Reader (readerID, fullName, address, phoneNumber),
     readerID là một số nguyên có 8 chữ số, tự động tăng,
      phoneNumber là số có độ dài là 10.
     */
    private static int id = 10000000;
    private int readerId;
    private String fullName;
    private String address;
    private String phoneNumber;

    public Reader(){

    }
    public Reader(int readerId){
        this.readerId = readerId;
    }

    public Reader(int readerId, String fullName, String address, String phoneNumber) {
        if(readerId == 0)this.readerId = id++;
        else  this.readerId = readerId;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Reader.id = id;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
