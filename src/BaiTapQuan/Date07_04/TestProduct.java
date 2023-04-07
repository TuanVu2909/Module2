package BaiTapQuan.Date07_04;

import java.util.Arrays;
import java.util.Scanner;

public class TestProduct {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập n:");
        int n = scanner.nextInt();
        scanner.nextLine();
        Products[] products = new Products[n];

        for (int i = 0; i < products.length; i++) {
            products[i] = inputProduct(i);
        }
        System.out.println(Arrays.toString(products));
//        deletePro(products);
//        searchName(products);
//        sumPrice(products);
//        updatePro(products);
    }

    public static Products inputProduct(int i) {
        System.out.println("Nhập id thứ: " + (i + 1));
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên:" + (i + 1));
        String name = scanner.nextLine();
        System.out.println("Nhập giá: " + (i + 1));
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập loại: " + (i + 1));
        String type = scanner.nextLine();
        return new Products(id, name, price, type);
    }

    public static Products searchName(Products[] products) {

        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                index = i;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("ko thấy");
        }
        System.out.println(products[index]);
        return products[index];

    }
    public static int sumPrice(Products[] products){
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        System.out.println(sum);
        return sum;
    }
    public static String updatePro(Products[] products){
        System.out.println("Nhập id:");
        int id = scanner.nextInt();
        for (int i =0;i< products.length; i++){
            if (id == products[i].getId()){
                products[i] = inputProduct(i);
                System.out.println(products[i]);
            }
        }
        return Arrays.toString(products);
    }
    public static String deletePro(Products[] products){

        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        Products[] products1 = new Products[products.length -1];
        int j = 0;
        for (int i =0; i<products.length; i++){
            if ( products[i].getId() != id){
                products1[j] = products[i];
                j++;
            }
        }
        for (int k =0; k< products1.length; k++){
            System.out.println(products1[k]);
        }
        return Arrays.toString(products1);
    }

}

