package Date05_04;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arr = new int[8];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            arr[i] = arr1[i];
            //System.out.println("mang arr: " + arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            arr[arr2.length + i] = arr2[i];
            //System.out.println("mang arr: " + arr[j]);
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

