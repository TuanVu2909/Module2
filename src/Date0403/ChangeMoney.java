package Date0403;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD");
        double usd = scanner.nextDouble();
        double vnd = usd*23000;
        System.out.println("VND: " +vnd+ "VNĐ");
    }
}
