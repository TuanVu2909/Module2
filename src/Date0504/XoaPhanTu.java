package Date0504;

import java.util.Arrays;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5};
        int x = 4;
        int[] newArray = new int[7];
        int j = 0;
        for (int k : arr) {

            if (k != x) {
                newArray[j] = k;
                j++;

            }
        }
        for (int c = 0 ; c < j; c++){
            System.out.print(newArray[c] +" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(newArray));
    }
    }


