import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập dữ liệu từ bàn phím
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // 2. Tính toán
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // 3. Xuất kết quả
        System.out.println("\n--- KẾT QUẢ HÌNH CHỮ NHẬT ---");
        System.out.printf("Chu vi: %.2f\n", chuVi);
        System.out.printf("Diện tích: %.2f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);
    }
}