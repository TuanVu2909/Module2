package Date05_04;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập độ dài mảng");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Quá độ dài mảng");
            }
        }while ( size>20);
        int[] arr = new int[size];
        for (int i =0; i< arr.length; i++){
            System.out.println("phần tử thứ " +(i+1)+ ":");
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j< arr.length; j++){
            System.out.println(arr[j] + "\t");
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j =0; j< arr.length/2; j++){
            int temp = arr[j];
            arr[j] = arr[size - 1-j];
            arr[size -1-j] = temp;

        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "" +"\n");
        for (int j =0; j< arr.length; j++){
            System.out.println(arr[j] + "\t");
        }

    }
}
