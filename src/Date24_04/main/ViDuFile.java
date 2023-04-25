package Date24_04.main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean kiemTraThucThi(){
        // kiểm tra thực thi
        return this.file.canExecute();
    }
    public boolean kiemTraDoc(){
        // kiểm tra đọc
        return  this.file.canRead();
    }
    public boolean kiemTraGhi(){
        // kiểm tra ghi
        return  this.file.canWrite();
    }
    public  void inDuongDan(){
        // In ra đường dẫn
        System.out.println(this.file.getAbsoluteFile());
    }
    public  void inTenFile(){
        // In ra tên file
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMucOrTapTin(){
        // Kiểm tra là thư mực hoặc tập tin
        if (this.file.isDirectory()){
            System.out.println("đây là thư mục");
        }else if (this.file.isFile()){
            System.out.println("đây là tập tin");
        }
    }
    public  void inRaThuMucCon(){
        if (this.file.isDirectory()){
            System.out.println("hiển thị ra các file con");
            File[] fileCon = this.file.listFiles();
            for (File file1 : fileCon) {
                System.out.println(file1);
            }
        }else if (this.file.isFile()){
            System.out.println("nó là tập tin, ko thể hiển thị file con");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập tên file");
        String tenFile = scanner.nextLine();
        ViDuFile viDuFile = new ViDuFile(tenFile);
        int number;
        do {
            System.out.println("MENU");
            System.out.println("1. Kiểm tra file có thể thực thi");
            System.out.println("2. Kiểm tra file có thể đọc");
            System.out.println("3. Kiểm tra file có thể ghi");
            System.out.println("4. In đường dẫn");
            System.out.println("5. In tên file");
            System.out.println("6.Kiểm tra file là thư mục hoặc tập tin ");
            System.out.println("7. In ra danh sách các File con ");
            System.out.println("8. In ra cây thư mục ");
            System.out.println("0. Thoát ");
            number = scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println(viDuFile.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(viDuFile.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(viDuFile.kiemTraGhi());
                    break;
                case 4:
                    viDuFile.inDuongDan();
                    break;
                case 5:
                    viDuFile.inTenFile();
                    break;
                case 6:
                    viDuFile.kiemTraLaThuMucOrTapTin();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    System.exit(0);
                    break;

            }


        }while (true);
    }
}
