package Date04_03;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("With: ");
        int with = scanner.nextInt();
        System.out.println("Height: ");
        int height = scanner.nextInt();
        int acreage = with*height;
        System.out.println("Acreage = " +acreage);
    }
}
