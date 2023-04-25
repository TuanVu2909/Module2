package BaiTapQuan.miniTest19_04;

import java.util.Arrays;
import java.util.Scanner;

public class MySymtem {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        ClassroomManage classroomManage = new ClassroomManage();
        classroomManage.disPlayClassroom();
        classroomManage.addClassroom();
        classroomManage.disPlayClassroom();
        Scanner scanner = new Scanner(System.in);

        int number ;
        do {
            System.out.println("MENU:");
            System.out.println("1.DisplayAll Student:");
            System.out.println("2.Add Student: ");
            System.out.println("3.Update Student :");
            System.out.println("4.Remove Student:");
            System.out.println("5.Putout Student:");
            System.out.println("6.Display Student of Classroom:");
            System.out.println("7.Display Student of AVG:");
            System.out.println("8.Display Student AVG Max:");
            System.out.println("9.DisPlay Student AVG Min:");
            System.out.println("10.SearchName theo tên gần đúng:");
            System.out.println("11.Display theo giới tính:");
            System.out.println("Mời Nhập lựa chọn:");
            number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    studentManage.displayALLStudent();
                    break;
                case 2:
                    studentManage.addStudent();
                    break;
                case 3:
                    studentManage.updateStudent();
                    break;
                case 4:
                    studentManage.removeStudent();
                    break;
                case 5:
                    studentManage.searchStudent();
                    break;
                case 6:
                    studentManage.displayStudentOfClassroom();
                    break;
                case 7:
                    studentManage.displayStudentOfAvg();
                    break;
                case 8:
                    studentManage.displayStudentOfAvgMax();
                    break;
                case 9:
                    studentManage.displayStudentOfAvgMin();
                    break;
                case 10:
                    studentManage.displayApproximateName();
                    break;
                case 11:
                    studentManage.displayStudentByGender();
                    break;

            }

        }while (true);


    }
}
