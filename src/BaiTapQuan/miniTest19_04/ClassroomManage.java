package BaiTapQuan.miniTest19_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomManage {
    List<Classroom> classroomList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ClassroomManage() {
        classroomList.add(new Classroom("Lớp 1"));
        classroomList.add(new Classroom("Lớp 2"));
    }

    public void addClassroom() {
        System.out.println("nhập số lớp cần khởi tạo ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập lớp: ");
            String name = scanner.nextLine();
            classroomList.add(new Classroom(name));
        }
    }

    public void disPlayClassroom() {
        for (Classroom classroom : classroomList) {
            System.out.println(classroom);
        }
    }

    public int getIdClassroom(int id) {
        for (int i = 0; i < classroomList.size(); i++) {
            if (classroomList.get(i).getId() == id) {
                return i;
            }

        }
        return -1;
    }

    public void updateClassroom() {
        System.out.println("Nhập id cần sửa");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        int id = getIdClassroom(idUpdate);
        if (id != -1) {
            System.out.println("Nhập tên sửa: ");
            classroomList.get(id).setName(scanner.nextLine());
        } else {
            System.out.println("nhập lại");
        }
    }
    public void putoutClassroom(){
        System.out.println("Nhập id class cần lấy ra");
        int idPutout = Integer.parseInt(scanner.nextLine());
        int id = getIdClassroom(idPutout);
        if (id != -1){
            System.out.println(classroomList);
        }
        else {
            System.out.println("Nhập lại id");
        }
    }


}
