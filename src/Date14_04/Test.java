package Date14_04;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Student> lstStudent = new ArrayList<>();
        MyList<Student> myList = new MyList<Student>(10);
        System.out.println(myList.getSize());
        Student newStudent1 = new Student("tú", 32);
        Student newStudent2 = new Student("vũ", 32);
        Student newStudent3 = new Student("đức", 32);
        myList.lstObject.add(newStudent1);
        myList.lstObject.add(newStudent2);
        myList.lstObject.add(newStudent3);
        System.out.println(myList.getLstObject());
       // myList.lstObject.remove(0);
       // System.out.println(myList.getLstObject());
        System.out.println(myList.getLstObject().size());
        Object obj = myList.lstObject.clone();
        System.out.println(obj);
        boolean flag = myList.lstObject.contains(newStudent1);
        System.out.println(flag);
        int a = myList.lstObject.indexOf(newStudent2);
        System.out.println(a);
        boolean b = myList.lstObject.add(newStudent3);
        System.out.println(b);
        System.out.println();
        System.out.println(myList.lstObject.get(1));
        System.out.println("trước khi xóa:"+ myList.getLstObject());
        myList.lstObject.clear();
        System.out.println("sau khi xóa:"+ myList.getLstObject());


    }
}
