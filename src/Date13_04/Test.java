package Date13_04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PhoneBookManager manager = new PhoneBookManager();
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("MENU");
            System.out.println("1.hiển thị Contact");
            System.out.println("2.thêm Contact");
            System.out.println("3. Xóa");
            System.out.println("4. Sửa");
            System.out.println("0. Exit");
            number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    manager.disPlay();
                    break;
                case 2:
                    manager.insertPhone();
                    break;
                case 3:
                    manager.removePhone();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);

    }

}
