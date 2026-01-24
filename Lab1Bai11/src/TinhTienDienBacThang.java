import java.util.Scanner;

public class TinhTienDienBacThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng: ");
        int soDien = scanner.nextInt();
        int tien;

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else if (soDien <= 100) {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        } else {
            tien = 50 * 1000 + 50 * 1200 + (soDien - 100) * 1500;
        }

        System.out.println("Tiền điện phải trả: " + tien + " đồng");
        scanner.close();
    }
}
