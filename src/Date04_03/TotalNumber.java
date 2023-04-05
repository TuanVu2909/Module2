package Date04_03;

import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        double total = 0;
        for (int i = 1; i <= n;i++){
             total += (double)i/(i+1);
        }
        System.out.println("Kết quả: "  +total);
    }
}
