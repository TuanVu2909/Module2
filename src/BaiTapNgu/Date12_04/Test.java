package BaiTapNgu.Date12_04;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử:");
        int n = Integer.parseInt(scanner.nextLine());
        Person[] arrPersons = new Person[n];
        Address address1 = new Address("Hà Nội");
        Address address2 = new Address("Thanh Hóa");
        Address address3 = new Address("Bắc Ninh");
        Address[] arrAddresses = new Address[]{address1,address2,address3};
        int number;
        do {
            System.out.println("Menu:");
            System.out.println("1.Tạo mảng Person:");
            System.out.println("2.Hiển thị theo thành phố:");
            System.out.println("3.Sắp xếp mảng theo thứ tự chữ cái:");
            System.out.println("0.Exit");
            System.out.println("Mời bạn nhập lựa chọn:");
            number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    addPerson(arrPersons,scanner,arrAddresses);
                    disPlay(arrPersons);
                    break;
                case 2:
                    searchByAddress(arrPersons,scanner,arrAddresses);
                    break;
                case 3:
                    arrangePerson(arrPersons);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("mời bạn nhập lại:");
            }
        }while (number != 0);

    }

    public static void arrangePerson(Person[] persons){

        Person temp;
        for (int i=0; i< persons.length; i++){
            for (int j = i+1;j< persons.length;j++ ){
                if (persons[i].getName().compareToIgnoreCase(persons[j].getName())>0){
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
            for (int i =0; i< persons.length ; i++){
                System.out.println(persons[i]);
            }
    }
    public static void addPerson(Person[] persons, Scanner scanner,Address[] addresses){
        for (int i =0; i < persons.length; i++){
            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println(Arrays.toString(addresses));
            System.out.println("mời bạn chọn thành phố:");
            int idAddress = Integer.parseInt(scanner.nextLine());
            Address newAddress = new Address();
            for (Address address : addresses) {
                if (address.getId() == idAddress) {
                    newAddress = address;
                }
            }
           Person person1 = new Person(name,age,newAddress);
            persons[i] = person1;
        }
    }
    public static void disPlay(Person[] persons){
        for (Person person : persons) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }
    public static void searchByAddress(Person[] persons, Scanner scanner, Address[] addresses){
        System.out.println("chọn thành phố:");
        System.out.println(Arrays.toString(addresses));
        int id = Integer.parseInt(scanner.nextLine());
        for (Person e : persons){
             if (e.getAddress().getId() == id){
                 System.out.println(e);
             }
        }
    }

}
