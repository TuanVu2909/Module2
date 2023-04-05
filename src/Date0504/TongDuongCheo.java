package Date0504;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[3][3];

        for (int i=0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.println("Nhap phan tu:" + "\n");
                arr[i][j] = scanner.nextInt();
            }
            System.out.println(Arrays.deepToString(arr));
        }
        int sum1 = 0;
        int sum2 = 0;

        for (int i=0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length; j++){
                if (i==j){
                    sum1 += arr[i][j];
                }
                if (j == (arr.length -1-i)){
                    sum2 += arr[i][j];
                }
            }

        }System.out.println(sum1);
        System.out.println(sum2);

    }
}
