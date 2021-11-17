package java_basic;

public class Bai9 {
    /*
    * cải thiện hiệu suất, hiệu năng hay trải nghiệm người dùng
      khi ta muốn thao tác với string: muốn thay đổi String(thêm, update, xóa) tạo ra mốt string mới
      tốn thời gian để thay đổi cấp phát bộ nhớ mới.
    * nếu ứng dụng có hàng triệu người dùng thì trãi nghiệm nó bị lag ...
    *
    * */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Le");
        stringBuilder.append("Tung");
        stringBuilder.insert(2," Quang ");
        stringBuilder.replace(0,1,"l");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());
    }
}
