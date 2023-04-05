package Date06_04.quadraticEquation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        khoiTaoPtb2 ptb2 = new khoiTaoPtb2(a, b, c);

        if (getDiscriminant(ptb2)>0){
            System.out.println(getRoot1(ptb2));
            System.out.println(getRoot2(ptb2));
        }else {
            System.out.println("vô nghiem");
        }

    }

    public static double getDiscriminant(khoiTaoPtb2 ptb2) {

        return ptb2.b * ptb2.b - 4 * ptb2.a * ptb2.c;
    }

    public static double getRoot1(khoiTaoPtb2 ptb2) {

        return (-ptb2.b + Math.sqrt(getDiscriminant(ptb2))/2* ptb2.a);
    }
    public static double getRoot2(khoiTaoPtb2 ptb2) {
       
        return   (-ptb2.b - Math.sqrt(getDiscriminant(ptb2))/2* ptb2.a);
    }
}