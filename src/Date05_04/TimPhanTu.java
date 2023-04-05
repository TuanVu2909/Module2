package Date05_04;

import java.util.Scanner;

public class TimPhanTu {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = true;
        for (int i =0; i< arr.length; i++){
            if (number == arr[i]){
                System.out.println("vị trí phần tử:" + arr[i] + " là:" +i);
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("ko có số");
        }
    }
}
