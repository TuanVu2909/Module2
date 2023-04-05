package Date0504;

import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("nhập độ dài mảng:");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Nhập quá độ dài mảng");
            }
        }while (size>20);
        int[] arr = new int[size];
        for (int i =0; i< arr.length; i++){
            System.out.println("phần thử thứ" +(i+1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("mảng arr:");
        for (int i : arr) {
            System.out.println(i + "\t");
        }
        int max = 0;
        int index =0;
        for (int j =0; j<arr.length; j++){
            if (max < arr[j]){
                max = arr[j];
                index=j;
            }
        }
        System.out.println("GTLN: " +max + " vị trí:" +index);

    }
}
