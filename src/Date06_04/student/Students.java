package Date06_04.student;

import java.util.Arrays;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassStudent student = new ClassStudent();
        ClassStudent student1 = new ClassStudent();
        ClassStudent student2 = new ClassStudent();
        ClassStudent[] students= {student,student1,student2};

        for (int i =0; i <students.length; i++){

            System.out.println("nhap ten: "+(i+1));
            String name = scanner.nextLine();
            students[i].setTen(name);

            System.out.println("Nhap tuoi: " +(i+1));
            int age = scanner.nextInt();
            students[i].setTuoi(age);

            System.out.println("nhap diem toan: " + (i+1));
            double toan = scanner.nextDouble();
            students[i].setToan(toan);

            System.out.println("nhap diem ly: " +( i+1));
            double ly = scanner.nextDouble();
            students[i].setLy(ly);

            System.out.println("nhap diem hoa: " +(i+1));
            double hoa = scanner.nextDouble();
            students[i].setHoa(hoa);

            System.out.println(students[i]);
        }



//        ClassStudent student1 = new ClassStudent("Chữ", 23, 8, 8, 10);
//        //System.out.println(student1);
//        ClassStudent student2 = new ClassStudent("Vũ", 24, 9, 8, 10);
//        ClassStudent student3 = new ClassStudent("Đức", 25, 10, 8, 10);
//        ClassStudent[] students = new ClassStudent[3];
//        students[0] = student1;
//        students[1] = student2;
//        students[2] = student3;
//
//
//        double tb = (students[0].getToan() + students[0].getLy()+ students[0].getHoa())/3;
//        double max = tb;
//        int index =0;
//        for (int i = 0; i < students.length; i++) {
//            if (max < (students[i].getToan()+students[i].getLy()+students[i].getHoa())/3) {
//                    index = i;
//            }
//        }
//        System.out.println(students[index]);

   }
}
