package PlusOne;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;

    }
}
