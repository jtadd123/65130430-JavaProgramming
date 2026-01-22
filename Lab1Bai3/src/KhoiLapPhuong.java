import java.util.Scanner;

public class KhoiLapPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh khối lập phương: ");
        double canh = scanner.nextDouble();

        // Cách 1: Nhân trực tiếp
        double theTich1 = canh * canh * canh;

        // 3. Xuất kết quả
        System.out.println("------------------------------");
        System.out.printf("Thể tích (cách 1): %.2f\n", theTich1);
       
    }
}