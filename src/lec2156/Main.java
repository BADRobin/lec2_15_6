package lec2156;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
//        workWithMaps();
        example();
    }

    private static void example() {
        String s = "mnogobykof potomy cto len' pisat' ((((( ";
        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                int count = map.getOrDefault(chars[i], 0);
                map.put(chars[i], count + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void workWithMaps() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println(map);
    }
}
