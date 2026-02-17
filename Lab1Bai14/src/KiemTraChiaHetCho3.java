import java.util.Scanner;

public class KiemTraChiaHetCho3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = sc.nextInt();

        if(n % 3 == 0){
            System.out.print("So vua nhap chia het cho 3  : ");
        }
        else {
            System.out.println("So vua nhap khong chia het cho 3  : ");
        }
        sc.close();
    }
}
