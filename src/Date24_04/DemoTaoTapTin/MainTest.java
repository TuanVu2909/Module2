package Date24_04.DemoTaoTapTin;

import java.io.File;
import java.io.IOException;

public class MainTest {
    public static void main(String[] args) {

        // Kiểm tra xem có tập tin hay thư mục có tồn tại hay không?
        File file = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date24_04\\DemoTaoTapTin");
        File file1 = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date24_04\\DemoTaoTapTin1");
        System.out.println("file có tồn tại không?: " + file1.exists());

        // Tạo thư mục
        //Phương thức mkdir() => tạo 1 thư mục
        File d1 = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date24_04\\Demo");
        d1.mkdir();

        //Phương thức mkdirs() => tạo nhiều thư mục 1 lúc
        File d2 = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date24_04\\Demo\\Demo1\\Demo2\\Demo3");
        d2.mkdirs();

        // Tạp tập tin : (Có phần mở rộng : .exe, .txt, .doc, .xls...)
        File file2 = new File("D:\\CodeGym\\Modue2\\Module2C0223i1\\src\\Date24_04\\Demo\\Vidu.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            //không có quyền tạo tập tin

            //ổ cứng bị đầy
            //đường dẫn bị sai
            throw new RuntimeException(e);
        }
    }
}
