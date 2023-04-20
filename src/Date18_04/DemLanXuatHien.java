package Date18_04;

import java.util.*;

public class DemLanXuatHien {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arrayList){
            if (!map.containsKey(element)){
                map.put(element,1);
            }else {
                map.put(element, map.get(element)+1);
            }
        }

        Set<Integer> set = map.keySet();
        for (int key : set){
            System.out.println(key + " " + map.get(key));
        }
    }
}
