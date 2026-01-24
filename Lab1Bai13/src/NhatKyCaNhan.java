import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NhatKyCaNhan {

    // Tên file để lưu dữ liệu
    private static final String TEN_FILE = "nhatky.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            inMenu();
            int luaChon = layLuaChon();

            switch (luaChon) {
                case 1:
                    vietNhatKy();
                    break;
                case 2:
                    docNhatKy();
                    break;
                case 3:
                    System.out.println("Tạm biệt! Hẹn gặp lại.");
                    return; // Thoát chương trình
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    // Hiển thị menu
    private static void inMenu() {
        System.out.println("\n=== NHẬT KÝ ĐIỆN TỬ ===");
        System.out.println("1. Viết nhật ký mới");
        System.out.println("2. Đọc lại nhật ký cũ");
        System.out.println("3. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    // Xử lý nhập lựa chọn từ bàn phím (tránh lỗi khi nhập chữ thay vì số)
    private static int layLuaChon() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Chức năng 1: Viết nhật ký
    private static void vietNhatKy() {
        System.out.println("\n--- VIẾT NHẬT KÝ ---");
        System.out.println("Nhập nội dung (Nhấn Enter để lưu):");
        String noiDung = scanner.nextLine();

        // Lấy thời gian hiện tại
        LocalDateTime hienTai = LocalDateTime.now();
        DateTimeFormatter dinhDang = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String thoiGian = hienTai.format(dinhDang);

        // Ghi vào file (chế độ append = true để nối tiếp, không ghi đè)
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(TEN_FILE, true), StandardCharsets.UTF_8))) {

            writer.write("Thời gian: " + thoiGian);
            writer.newLine();
            writer.write("Nội dung: " + noiDung);
            writer.newLine();
            writer.write("--------------------------------------------------");
            writer.newLine();

            System.out.println(">> Đã lưu thành công!");

        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    // Chức năng 2: Đọc nhật ký
    private static void docNhatKy() {
        File file = new File(TEN_FILE);

        // Kiểm tra file có tồn tại không
        if (!file.exists()) {
            System.out.println("\n>> Chưa có dữ liệu nhật ký nào.");
            return;
        }

        System.out.println("\n--- ĐỌC NHẬT KÝ ---");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {

            String dong;
            while ((dong = reader.readLine()) != null) {
                System.out.println(dong);
            }

        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}