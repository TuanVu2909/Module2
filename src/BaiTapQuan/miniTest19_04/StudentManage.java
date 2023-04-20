package BaiTapQuan.miniTest19_04;

import java.util.*;

public class StudentManage implements Manage<Student> {

    List<Student> studentList = new ArrayList<>();

    Student student = new Student();
    Scanner scanner = new Scanner(System.in);
    ClassroomManage classroom = new ClassroomManage();

    public StudentManage() {
        studentList.add(new Student("Vũ", 31, "Nam", 8, new Classroom("Lớp 1")));
        studentList.add(new Student("Đức", 29, "Nam", 9, new Classroom("Lớp 2")));
        studentList.add(new Student("Chữ", 26, "Nữ", 5, new Classroom("Lớp 1")));
    }

    @Override
    public Student creat() {
        System.out.println("Nhập số phần tử cần khởi tạo");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Chọn giới tính: ");
            String gender = String.valueOf(gender(scanner, student));
            System.out.println("Nhập điểm trung bình");
            double avgPoint = Double.parseDouble(scanner.nextLine());
            System.out.println("Chọn lớp học theo id");
            System.out.println(classroom.classroomList);
            Classroom classroom = classroom();
            return new Student(name, age, gender, avgPoint, classroom);
        }

        return null;
    }


    public void addStudent() {
        studentList.add(creat());
    }

    public static String gender(Scanner scanner, Student student) {

        int number;
        System.out.println("MENU");
        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        System.out.println("3.Other");
        number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                student.gender = "Nam";
                break;
            case 2:
                student.gender = "Nữ";
                break;
            case 3:
                student.gender = "Other";
                break;
            case 0:
                System.exit(0);
                break;
        }
        return student.gender;
    }

    public Classroom classroom() {
        System.out.println("Chọn lớp học theo id");
        System.out.println(classroom.classroomList);
        int id = Integer.parseInt(scanner.nextLine());
        for (Classroom classroom1 : classroom.classroomList)
            if (classroom1.getId() == id) {
                return classroom1;
            }

        return null;
    }

    public int getIdByStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void updateStudent() {
        System.out.println("Nhập id Student cần sửa:");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        int id = getIdByStudent(idUpdate);
        if (id != -1) {
            System.out.println("Nhập tên sửa:");
            studentList.get(id).setName(scanner.nextLine());
            System.out.println("Nhập tuổi sửa:");
            studentList.get(id).setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập giới tính sửa:");
            studentList.get(id).setGender(gender(scanner, student));
            System.out.println("Nhập điểm trung bình sửa:");
            studentList.get(id).setAvgPoint(Double.parseDouble(scanner.nextLine()));
            System.out.println("Nhập Class sửa:");
            studentList.get(id).setClassroom(classroom());
            System.out.println(studentList.get(id));
        } else {
            System.out.println("Nhập lại Id");
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập id Student cần sửa:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        int id = getIdByStudent(idDelete);
        if (id != -1) {
            studentList.remove(id);
            System.out.println(studentList.get(id));
        } else {
            System.out.println("Nhập lại Id");
        }
    }

    @Override
    public void searchStudent() {
        System.out.println("Nhập id Student cần tìm:");
        int idSearch = Integer.parseInt(scanner.nextLine());
        int id = getIdByStudent(idSearch);
        if (id != -1) {
            System.out.println(studentList.get(id));
        } else {
            System.out.println("Nhập lại Id");
        }
    }

    public void displayStudentOfClassroom() {
        System.out.println(classroom.classroomList);
        System.out.println("nhập Class cần tìm theo id");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < classroom.classroomList.size(); i++) {
            if (id == classroom.classroomList.get(i).getId()) {
                for (int j = 0; j < studentList.size(); j++) {
                    if (studentList.get(j).getId() == classroom.classroomList.get(i).getId()) {
                        System.out.println(studentList.get(j));
                        flag = false;
                    }
                }
            }
        }
        if (flag) {
            System.out.println("Nhập lại Id");
        }
    }
    public void displayStudentOfAvg(){

        for (int i = 0; i< studentList.size(); i ++){
            if ( studentList.get(i).getAvgPoint() > 8 ){
                System.out.println(studentList.get(i) + " Giỏi");
            }else if ( studentList.get(i).getAvgPoint() >6 ){
                System.out.println(studentList.get(i) + " Khá");
            }else if (studentList.get(i).getAvgPoint() > 4.5){
                System.out.println(studentList.get(i) + " Trung Bình");
            }else {
                System.out.println(studentList.get(i) + " Kém");
            }
        }
    }
    public void displayStudentOfAvgMax(){
        double max = 0;
        int index =0;
        for (int i =0; i< studentList.size(); i ++){
            if (max < studentList.get(i).getAvgPoint()){
                max = studentList.get(i).getAvgPoint();
                index =i;
            }
        }
        System.out.println(studentList.get(index));

    }
    public void displayStudentOfAvgMin(){
        double min = studentList.get(0).getAvgPoint();
        int index =0;
        for (int i =0; i< studentList.size(); i ++){
            if (min > studentList.get(i).getAvgPoint()){
                index =i;
            }
        }
        System.out.println(studentList.get(index));
    }
    public void displayApproximateName(){
        System.out.println("Nhập tên cần tìm: ");
        String name = scanner.nextLine();
        if (!name.equals("")) {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getName().contains(name)) {
                    System.out.println(studentList.get(i));
                }
            }
        }else {
            System.out.println("Nhập lại tên");
        }
    }
    public void displayStudentByGender(){
        System.out.println(gender(scanner,student));
        for (int i =0 ; i< studentList.size(); i++){
            if (student.gender.equals(studentList.get(i).getGender())){
                System.out.println(studentList.get(i));
            }
        }
    }



    @Override
    public void displayALLStudent() {
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
    }
}
