import java.util.Scanner;
public class SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất dữ liệu
        System.out.println("----- THÔNG TIN SINH VIÊN -----");
        System.out.print("Họ và tên: ");
        System.out.println(hoTen);

        System.out.printf("Điểm trung bình: %.2f điểm", diemTB);
    }
}
