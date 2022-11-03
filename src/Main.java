import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tháng gửi:");
        int month = scanner.nextInt();

        System.out.println("Nhập số tiền gửi:");
        double money = scanner.nextDouble();

        System.out.println("Nhập lãi suất hàng năm theo tỷ lệ phần trăm:");
        double interestRate = scanner.nextDouble();

        double x = 0;
        for (int i = 0; i < month; i++) {
            x = money * (interestRate / 100 / 12) * month;
        }
        System.out.println("Số tiền lãi là: " + x);
    }
}
