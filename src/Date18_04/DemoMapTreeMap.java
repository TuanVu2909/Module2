package Date18_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMapTreeMap {
    public static void main(String[] args) {
        //Tạo HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Đức", 32);
        hashMap.put("Vũ", 34);
        hashMap.put("Chữ", 36);
        System.out.println("hiển thị Map");
        System.out.println(hashMap +"\n");
        // Tạo TreeMap sắp xếp theo key
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("hiển thị entries key");
        System.out.println(treeMap);
        // Tạo LinkedHash
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Vũ",31);
        linkedHashMap.put("Đức",32);
        linkedHashMap.put("Chữ",33);
        System.out.println("\n tuổi của đức là:" +linkedHashMap.get("Đức"));

    }
}
