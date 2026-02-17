import java.util.Scanner;

public class PhanLoaiTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();

        // Kiểm tra có phải tam giác không
        if (a + b > c && a + c > b && b + c > a) {

            // Tam giác đều
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            }
            // Tam giác vuông cân
            else if ((a == b && a * a + b * b == c * c) ||
                    (a == c && a * a + c * c == b * b) ||
                    (b == c && b * b + c * c == a * a)) {
                System.out.println("Tam giac vuong can");
            }
            // Tam giác vuông
            else if (a * a + b * b == c * c ||
                    a * a + c * c == b * b ||
                    b * b + c * c == a * a) {
                System.out.println("Tam giac vuong");
            }
            // Tam giác cân
            else if (a == b || a == c || b == c) {
                System.out.println("Tam giac can");
            }
            // Còn lại
            else {
                System.out.println("Tam giac thuong");
            }

        } else {
            System.out.println("Khong phai tam giac");
        }

        sc.close();
    }
}
