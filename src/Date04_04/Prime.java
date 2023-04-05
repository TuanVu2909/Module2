package Date04_04;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        if (n<2){
            System.out.println("ko phai SNT");
        }else {
            boolean check = true;
            for (int i = 2 ; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    check = false;
                    break;
                }
            }if (check){
                System.out.println(n + "là số NT");
            }else {
                System.out.println(n + "ko là SNT");
            }
        }

    }
}
