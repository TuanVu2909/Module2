package BaiTapQuan.Date12_04.QuanLySanPham;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Brand brand1 = new Brand("Apple");
        Brand brand2 = new Brand("Sam Sung");
        Brand brand3 = new Brand("Oppo");
        Brand[] arrBrand = new Brand[]{brand1,brand2,brand3};
        Product[] arrProduct = new Product[3];
        int number;
        do {
            System.out.println("MENU:");
            System.out.println("1.AddProduct");
            System.out.println("2.Hiển thị");
            System.out.println("0. Exit");
            System.out.println("Mời bạn nhập lựa chọn:");
            number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    addProduct(arrProduct, arrBrand);
                    break;
                case 2:
                    disPlay(arrProduct);
                case 0:
                    break;
            }
        }while (number !=0);
    }

    public static void addProduct(Product[] products, Brand[] brands) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
            System.out.println("Nhập giá");
            double price = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập mô tả");
            String color = scanner.nextLine();
            System.out.println(Arrays.toString(brands));
            System.out.println("Nhập hãng:");
            int idBrand = Integer.parseInt(scanner.nextLine());
            Brand newBrand = new Brand();
            for (Brand brand : brands) {
                if (brand.getId() == idBrand) {
                    newBrand = brand;
                }
            }
            Product product = new Product(name, price, color, newBrand);
            products[i] = product;
        }
    }
    public static void disPlay(Product[] products){
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }


}

