package Date06_04.student;

import java.util.Arrays;

public class Students {
    public static void main(String[] args) {

        ClassStudent student1 = new ClassStudent("Chữ", 23, 8, 8, 10);
        //System.out.println(student1);
        ClassStudent student2 = new ClassStudent("Vũ", 24, 9, 8, 10);
        ClassStudent student3 = new ClassStudent("Đức", 25, 10, 8, 10);
        ClassStudent[] students = new ClassStudent[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;


        double tb = (students[0].getToan() + students[0].getLy()+ students[0].getHoa())/3;
        double max = tb;
        int index =0;
        for (int i = 0; i < students.length; i++) {
            if (max < (students[i].getToan()+students[i].getLy()+students[i].getHoa())/3) {
                    index = i;
            }
        }
        System.out.println(students[index]);

   }
}
