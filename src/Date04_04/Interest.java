package Date04_04;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiên gửi vào:");
        double deposits = scanner.nextDouble();
        System.out.println("Nhập lãi xuất ngân hàng:");
        double interest = scanner.nextDouble();
        System.out.println("nhập số tháng:");
        int month = scanner.nextInt();
        double total = deposits*(interest/100)/12*month;
        System.out.println(total);
        double sum =0;
        for (int i =0; i< 12; i++){
            sum += total;
        }

        System.out.println(sum);
    }
}
