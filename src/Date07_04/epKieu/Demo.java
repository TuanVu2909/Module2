package Date07_04.epKieu;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Geometric();// đem đối tượng của lớp con cho biến của lớp cha tham chiếu
        Object obj = new Geometric();
        Demo student = new Student();

//        Geometric geo= demo;
//        if (demo instanceof Geometric){
            Geometric geometric = (Geometric)demo;
//        }
//        if (student instanceof Geometric){
//            Geometric geometric1 = (Geometric)student;
//        }



    }
    }

