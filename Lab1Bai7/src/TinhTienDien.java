import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int tien;

        if (soDien < 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Tiền điện phải trả: " + tien + " đồng");

        scanner.close();
    }
}
