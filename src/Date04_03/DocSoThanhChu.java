package Date04_03;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int number = scanner.nextInt();
        int a = number/100;
        int b = (number%100)/10;
        int c = number%10;
        String total = "";
        switch (a){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
              total +=  a+"hundred";
                break;
        }
        switch (b){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                total +=  b+"ty";
                break;
        }
        switch (c){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                total +=  c+"ghfg";
                break;
        }
        System.out.println(total);
    }
}
