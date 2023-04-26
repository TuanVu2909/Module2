package Date25_04.MiniTest.service.impl;

import Date25_04.MiniTest.IOFIle.IOFileClassroom;
import Date25_04.MiniTest.model.Classroom;
import Date25_04.MiniTest.service.Manage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManage implements Manage<Classroom> {

    private final Scanner scanner;
    static ArrayList<Classroom> classrooms = new ArrayList<>();
    static IOFileClassroom ioFileClassroom= new IOFileClassroom();

    public ClassroomManage(Scanner scanner) {
        this.scanner = scanner;
        classrooms = new ArrayList<>();
        classrooms.add(new Classroom("C0223I1"));
        classrooms.add(new Classroom("C1022I1"));
        try {
            ioFileClassroom.readClassroom(getClassrooms());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    @Override
    public Classroom create() {
        System.out.println("Input name classroom: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(name);
        classrooms.add(classroom);
        return classroom;
    }

    @Override
    public Classroom update() {
        Classroom classroom = getById();
        if (classroom != null) {
            System.out.println("Input new name classroom: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                classroom.setName(name);
            }
        }
        return classroom;
    }

    @Override
    public Classroom delete() {
        Classroom classroom = getById();
        if (classroom != null) {
            classrooms.remove(classroom);
        }
        return classroom;
    }

    @Override
    public Classroom getById() {
        displayAll();
        System.out.println("Input id you want to find: ");
        String i = scanner.nextLine();
        if (!i.equals("")) {
            int id = Integer.parseInt(i);
            for (Classroom classroom : classrooms) {
                if (classroom.getId() == id) {
                    return classroom;
                }
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        System.out.printf("%-10s%s", "ID", "NAME\n");
        for (Classroom classroom : classrooms) {
            classroom.display();
        }
    }

    public void displayOne(Classroom classroom) {
        if (classroom != null) {
            classroom.display();
        } else {
            System.out.println("Not exist this object!");
        }
    }
}
