package BaiTapNgu.Date24_04;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    List<Account> accountList = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        List<Account> accountList = new ArrayList<>();
        Account account = new Account();

        Scanner scanner = new Scanner(System.in);
        int number = -1;
        do {
            System.out.println("MENU");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("0. Thoát");
            try {
                number = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng");
            }
                switch (number){
                    case 1:
                      readAccount(accountList);
                        break;
                    case 2:
                        registerAccount(accountList,scanner);
                        break;
                    case 0:
                        break;
                }
        }while (true);
    }
    public static void registerAccount(List<Account> accountList,Scanner scanner){
        System.out.println("Nhập UserName");
        String username = scanner.nextLine();
        System.out.println("Nhập PassWord");
        String password = scanner.nextLine();
        System.out.println("Nhập FullName");
        String fullName = scanner.nextLine();
        System.out.println("Nhập PhoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Address");
        String address = scanner.nextLine();
        Account account = new Account(username, password, fullName, phoneNumber, address);
        accountList.add(account);
        File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\BaiTapNgu\\Date24_04\\Account.txt");
        try {
            if (!file.exists()){
                throw  new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Account account1 : accountList) {
                bufferedWriter.write(account1 + "\n");
            }

            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Đăng ký thành công");

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static void readAccount(List<Account> accountList ) throws IOException {

            File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\BaiTapNgu\\Date24_04\\Account.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] str;
            while (((line = bufferedReader.readLine()) != null)) {
                str = line.split(", ");
                accountList.add(new Account(str[0], str[1], str[2], str[3], str[4]));
            }
            System.out.println(accountList);
            bufferedReader.close();
            fileReader.close();

        }
    }


