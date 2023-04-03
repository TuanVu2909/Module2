package Date0403;

import java.util.Scanner;

public class VariableName {
    public static void main(String[] args) {
        int i = 10;
        float f = 20.5f;
        double d = 20.5;
        boolean b = true;
        long l = 142536;
        char c = 'a';
        String s = "Ha Noi";
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("l = " + l);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scanner.nextInt();
        System.out.println(a);
    }
}