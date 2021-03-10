package IntegerToRoman;

import java.util.TreeMap;

public class MapSolution {
    public static String intToRoman(int num) {
        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> b-a);
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");

        StringBuilder res = new StringBuilder();
        for(int i: map.keySet()) {
            while(num > i) {
                res.append(map.get(i));
                num -= i;
            }
        }
        return res.toString();
    }
}
