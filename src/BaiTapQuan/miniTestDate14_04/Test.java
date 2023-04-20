package BaiTapQuan.miniTestDate14_04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStudent manageStudent = new ManageStudent();


        int number;
        do {
            System.out.println("MENU:");
            System.out.println("1. Display Student");
            System.out.println("2.Add Student");
            System.out.println("3.Remove Student");
            System.out.println("4.Search Student");
            System.out.println("5.Update Student");
            System.out.println("6.Sort Student");
            System.out.println("7.Sum Avg");
            System.out.println("Nhập lựa chọn:");
            number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    manageStudent.disPlayAll();
                    break;
                case 2:
                    manageStudent.addStudent();
                    break;
                case 3:
                    manageStudent.removeStudent();
                    break;
                case 4:
                    manageStudent.searchStudent();
                    break;
                case 5:
                    manageStudent.updateStudent();
                    break;
                case 6:
                    manageStudent.sortStudentAvg();
                    break;

                case 7:
                    manageStudent.sumAvg();
                    break;
                case 0:
                    System.exit(0);

            }
        }while (true);

    }
}
