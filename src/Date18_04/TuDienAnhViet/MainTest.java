package Date18_04.TuDienAnhViet;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> traTuDien = new LinkedHashMap<>(16, 0.75f, true);
        traTuDien.put("Hello", "Xin chào");
        traTuDien.put("Apple", "Táo");
        traTuDien.put("Yellow", "Màu Vàng");
        traTuDien.put("Father", "Bố");
        System.out.println(traTuDien);

        int number;
        do {
            System.out.println("Menu");
            System.out.println("1.DisPlay Từ điển");
            System.out.println("2.Thêm Từ Điển");
            System.out.println("3.Dịch Từ Điển");
            System.out.println("4.Sửa Từ Điển");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    disPlayAll(traTuDien);
                    break;
                case 2:
                    putAll(scanner, traTuDien);
                    break;
                case 3:
                   searchTuDien(scanner,traTuDien);
                case 4:

            }
        } while (true);


    }

    public static void putAll(Scanner scanner, Map<String, String> tuDien) {

        System.out.println("Tiếng Anh:");
        String name1 = scanner.nextLine();
        System.out.println("Tiếng Việt");
        String name2 = scanner.nextLine();
        if (!name1.equalsIgnoreCase("") && !name2.equalsIgnoreCase("")) {
            tuDien.put(name1, name2);
            System.out.println("Thêm thành công");
        }
    }

    public static void searchTuDien(Scanner scanner, Map<String, String> map) {
        System.out.println("nhập tên cần tìm");
        String search = scanner.nextLine();

        if (!search.equalsIgnoreCase("")) {
            Set<String> set = map.keySet();
            for (String key : set) {
                if (search.equals(key)) {
                    System.out.println(key + " " +map.get(key));
                }
            }
        } else {
            System.out.println("nhập lại");
        }
    }
    public static void updateTuien(Scanner scanner, Map<String, String> map){
        System.out.println("nhập từ cần sửa");
        String name = scanner.nextLine();
        if (!name.equals("")){

        }
    }

    public static void disPlayAll(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
