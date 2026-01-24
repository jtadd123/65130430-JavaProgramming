import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TY_GIA = 24000;

        System.out.println("1. USD -> VND");
        System.out.println("2. VND -> USD");
        System.out.print("Chọn chức năng: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Nhập số USD: ");
            double usd = scanner.nextDouble();
            double vnd = usd * TY_GIA;
            System.out.printf("= %.0f VND\n", vnd);
        } else if (choice == 2) {
            System.out.print("Nhập số VND: ");
            double vnd = scanner.nextDouble();
            double usd = vnd / TY_GIA;
            System.out.printf("= %.2f USD\n", usd);
        } else {
            System.out.println("Chọn sai chức năng!");
        }

        scanner.close();
    }
}
