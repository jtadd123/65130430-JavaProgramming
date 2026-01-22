import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các hệ số cho phương trình: ax^2 + bx + c = 0");
        // Nhập hệ số
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta = " + delta);

        // Tính căn delta
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn bậc hai trong tập số thực");
        }
    }
}
