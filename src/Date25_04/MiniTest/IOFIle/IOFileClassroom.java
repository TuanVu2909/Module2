package Date25_04.MiniTest.IOFIle;

import Date25_04.MiniTest.model.Classroom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileClassroom {



    public void writerClassroom(List<Classroom> classrooms) throws IOException {
        File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date25_04\\MiniTest\\IOFIle\\IOFileClassroom");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Classroom classroom : classrooms) {
            bufferedWriter.write(classroom.toString()+ "\n");
        }
        bufferedWriter.close();
        fileWriter.close();

    }
    public List<Classroom>  readClassroom(List<Classroom> classrooms) throws IOException {
        List<Classroom> classroomList = new ArrayList<>();
        File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date25_04\\MiniTest\\IOFIle\\IOFileClassroom");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine())!=null){
            String[] str = line.split("%-10s%s");
            Classroom classroom = new Classroom(str[0]);
            classroomList.add(classroom);
        }
        bufferedReader.close();
        fileReader.close();

        return  classroomList;
    }
}
