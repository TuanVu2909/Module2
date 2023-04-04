package Date0403;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();

       if (year %4 ==0){
           if (year % 100 ==0){
               if (year % 400 ==0){
                   System.out.println("là năm nhuận");
               }else {
                   System.out.println("ko phải năm nhuận");
               }
           }else {
               System.out.println("là năm nhuận");
           }
       }else {
           System.out.println("ko là năm nhuận");
       }
    }
}
