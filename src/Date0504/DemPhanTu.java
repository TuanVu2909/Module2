package Date0504;

import java.util.Scanner;

public class DemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "hello";
        System.out.println("Nhap ky tu:");
        String item = scanner.nextLine();
        int count = 0;
        for (int i =0; i<str.length(); i++){
            if ( item.equals(String.valueOf(str.charAt(i))) ){
                count++;
            }
        }
        System.out.println(count);

    }
}
