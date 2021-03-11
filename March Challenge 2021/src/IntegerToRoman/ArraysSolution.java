package IntegerToRoman;

public class ArraysSolution {
    public String IntToRoman(int num) {
        int[] ints = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int n = 13;
        StringBuilder sb = new StringBuilder();
        for(int i=n-1; i>=0; i--) {
            while(num >= ints[i]) {
                sb.append(romans[i]);
                num -= ints[i];
            }
        }
        return sb.toString();
    }
}
