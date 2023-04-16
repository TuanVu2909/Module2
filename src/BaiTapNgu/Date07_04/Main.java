package BaiTapNgu.Date07_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       FullTime fullTime1 = new FullTime("Chữ",25,8);
       FullTime fullTime2 = new FullTime("Đức",28,9);
       PartTime partTime1 = new PartTime("Vũ",32,4);
       PartTime partTime2 = new PartTime("Thái",21,3);
       Employee[] employees = new Employee[]{fullTime1,fullTime2,partTime1,partTime2};
       for (int i =0; i<employees.length;i++){
           System.out.println(employees[i]);
       }
       int number;
       do {
           System.out.println("Menu:");
           System.out.println("1. Hiển thị nhân viên FullTime:");
           System.out.println("2. Hiển thị nhân viên PartTime:");
           System.out.println("3. Thêm nhân viên mới:");
           System.out.println("4. Xóa  nhân viên:");
           System.out.println("5. Sửa  nhân viên:");
           System.out.println("Nhập lựa chọn của bạn:");
           number = Integer.parseInt(scanner.nextLine());
           switch (number){
               case 1:
                displayFullTime(employees);
                   break;
               case 2:
                   displayPartTime(employees);
                   break;
               case 3:
                  do {
                      System.out.println("Menu:");
                      System.out.println("1.Thêm phần tử Fulltime");
                      System.out.println("2.Thêm phần tử Parttime");
                      System.out.println("0. Exit");
                      System.out.println("Nhập lựa chọn của bạn:");
                      number = Integer.parseInt(scanner.nextLine());
                      switch (number){
                          case 1:
                              displayAll(employees);
                              employees = addFullTime(employees,scanner);
                              displayAll(employees);
                              break;
                          case 2:
                              displayAll(employees);
                              employees = addPartTime(employees,scanner);
                              displayAll(employees);
                              break;
                          case 0:
                             break;
                      }
                  }while (number != 0);
                   break;
               case 4:
                   System.out.println("Nhập id xóa:");
                   int deteID = Integer.parseInt(scanner.nextLine());
                   employees = deleteEmployee(employees,deteID);
                   break;
               case 5:
                   System.out.println("Nhập tên sửa:");
                   String updateName = scanner.nextLine();
                   employees = updateEmployee(employees,updateName);
                   displayAll(employees);
                   break;
               default:
                   System.out.println("bạn nhập lại lựa chọn" +number);
           }
       }while (number != 0);
    }
    public static void displayFullTime(Employee[] employees ){
        for (int i =0; i< employees.length; i++){
            if (employees[i] instanceof FullTime){
                FullTime fullTime = (FullTime) employees[i];
                System.out.println(fullTime);
            }
        }
    }
    public static void displayPartTime(Employee[] employees){
        for (int i =0; i< employees.length; i++){
            if (employees[i] instanceof PartTime){
                PartTime partTime = (PartTime) employees[i];
                System.out.println(partTime);
            }
        }
    }
    public static int findIndexById(Employee[] employees) {
        System.out.println("Nhap id can xoa:");
        int id = scanner.nextInt();
        for (int i =0; i< employees.length; i++) {
            if (employees[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public  static Employee[] deleteEmployee(Employee[] employees, int id) {
        Employee[] newEmployee ;
        if (findIndexById(employees) > -1){
           newEmployee= new Employee[employees.length -1];
            }
            else {
            return employees;
        }

            int index =0;
            for (int i =0; i< newEmployee.length; i++){
                if (employees[i].getId() != id){
                    newEmployee[index] = employees[i];
                    index++;
                }
            }
return newEmployee;
    }
    public static Employee[] addFullTime(Employee[] employees, Scanner scanner){
        int id = employees.length +1;
//        System.out.println("Nhập id: ");
//        int id  = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lương FullTime:");
        int yearOfExperience  = Integer.parseInt(scanner.nextLine());
        Employee newEmployee = new FullTime(name,age,yearOfExperience);
        int i = employees.length;
        employees = Arrays.copyOf(employees,i+1);
        employees[i] = newEmployee;
       return employees;
    }
    public static Employee[] addPartTime(Employee[] employees, Scanner scanner){
        int id = employees.length +1;
//        System.out.println("Nhập id");
//        int id  =  Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lương PartTime:");
        int wordTime  = Integer.parseInt(scanner.nextLine());
        Employee newEmployee = new PartTime(name,age,wordTime);
        int i = employees.length;
        employees = Arrays.copyOf(employees,i+1);
        employees[i] = newEmployee;
        return employees;
    }
    public static Employee[] updateEmployee(Employee[] employees, String name){

        for (int i =0; i< employees.length; i++){
            if (employees[i].getName().equalsIgnoreCase(name)){
                if (employees[i] instanceof FullTime) {
                    System.out.println("Nhập id sửa:");
                    int id = Integer.parseInt(scanner.nextLine());
                    employees[i].setId(id);
                    System.out.println("Nhập tên cần sửa: ");
                    String name1 = scanner.nextLine();
                    employees[i].setName(name1);
                    System.out.println("Nhập tuổi cần sửa:");
                    int age = Integer.parseInt(scanner.nextLine());
                    employees[i].setAge(age);
                    System.out.println("Nhập lương cần sửa:");
                    int yearOfExperience = Integer.parseInt(scanner.nextLine());
                    ((FullTime) employees[i]).setYearOfExperience(yearOfExperience);
                }else {
                    System.out.println("Nhập id sửa:");
                    int id = Integer.parseInt(scanner.nextLine());
                    employees[i].setId(id);
                    System.out.println("Nhập tên cần sửa: ");
                    String name1 = scanner.nextLine();
                    employees[i].setName(name1);
                    System.out.println("Nhập tuổi cần sửa:");
                    int age = Integer.parseInt(scanner.nextLine());
                    employees[i].setAge(age);
                    System.out.println("Nhập lương cần sửa:");
                    int wordTime = Integer.parseInt(scanner.nextLine());
                    ((PartTime) employees[i]).setWordTime(wordTime);
                }
            }
        }
        return employees;
    }

    public static void displayAll(Employee[] employees){
        for (int i =0; i< employees.length; i++){
            if (employees[i]!=null){
                System.out.println(employees[i]);
            }
        }
    }
}
