package BaiTapNgu.Date07_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       FullTime fullTime1 = new FullTime(12,"Chữ",25,8);
       FullTime fullTime2 = new FullTime(22,"Đức",28,9);
       PartTime partTime1 = new PartTime(12,"Vũ",32,4);
       PartTime partTime2 = new PartTime(12,"Thái",21,3);
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
                      }
                  }while (number != 0);
                   break;
               case 4:
                   displayAll(employees);
                   employees = deleteEmployee(employees,scanner);
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
    public  static Employee[] deleteEmployee(Employee[] employees, Scanner scanner) {
        System.out.println("Nhập tên cần xóa:");
        String name = scanner.nextLine();
        Employee[] employeesDelete = new Employee[employees.length - 1];
        int index = 0;
        boolean check = false;
        for (int i = 0; i < employees.length; i++) {
            if (!employees[i].getName().equalsIgnoreCase(name)) {
                employeesDelete[index] = employees[i];
                index++;
            }else {
                check = true;
            }
        }
        if (check) {
            System.out.println("xóa thành công");
            return employeesDelete;
        } else {
            return employees;
        }

    }
    public static Employee[] addFullTime(Employee[] employees, Scanner scanner){

        System.out.println("Nhập id: ");
        int id  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lương FullTime:");
        int yearOfExperience  = Integer.parseInt(scanner.nextLine());
        Employee newEmployee = new FullTime(id,name,age,yearOfExperience);
        int i = employees.length;
        employees = Arrays.copyOf(employees,i+1);
        employees[i] = newEmployee;
       return employees;
    }
    public static Employee[] addPartTime(Employee[] employees, Scanner scanner){

        System.out.println("Nhập id");
        int id  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lương FullTime:");
        int wordTime  = Integer.parseInt(scanner.nextLine());
        Employee newEmployee = new PartTime(id,name,age,wordTime);
        int i = employees.length;
        employees = Arrays.copyOf(employees,i+1);
        employees[i] = newEmployee;
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
