import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(" Nam nhuan");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(" Nam nhuan");
        } else {
            System.out.println(" Khongg phai nam nhuan");
        }
        sc.close();
    }
}
