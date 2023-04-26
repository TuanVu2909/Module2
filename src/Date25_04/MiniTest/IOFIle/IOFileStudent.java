package Date25_04.MiniTest.IOFIle;

import Date25_04.MiniTest.model.Classroom;
import Date25_04.MiniTest.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileStudent {
    public void writerFileStudent() throws IOException {
        List<Student> studentList = new ArrayList<>();
        File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date25_04\\IOFile\\IOFileStudent");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : studentList){
            bufferedWriter.write(student.toString()+ "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
    public List<Student> readFileStudent(List<Student> students) throws IOException {
        List<Student> studentList = new ArrayList<>();
        File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date25_04\\IOFile\\IOFileStudent");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String c;
        while ((c = bufferedReader.readLine()) != null){
            String[] str = c.split("10s%");
            Student student = new Student(str[0],Integer.parseInt(str[1]),str[2],Double.parseDouble(str[3]),new Classroom(str[4]));
            studentList.add(student);
        }
        bufferedReader.close();
        fileReader.close();
        return studentList;
    }
}
