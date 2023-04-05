package Date0504;

import java.util.Scanner;

public class TongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int i=0; i< arr.length; i++){
            for (int j =0; j< arr[i].length; j++){
                System.out.println("Nhap phan tu:");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhap tong cot muon tinh");
        int size = scanner.nextInt();
        int sum =0;

        for (int i=0; i< arr.length; i++){
            for (int j =0; j< arr[i].length; j++){
                if (size == j){
                   sum += arr[i][j];
               }
            }

        }
        System.out.println(sum);

    }
}
