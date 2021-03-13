package CheckIfStringContainsAllBinaryCodesOfSizeK;

public class BooleanSolution {
    public boolean hasAllCodes(String s, int k) {
        int n = (int) Math.pow(2,k);
        boolean[] arr = new boolean[n];

        for(int i=0; i<= s.length() - k; i++) {
            String binaryString = s.substring(i, i+k);
            arr[Integer.parseInt(binaryString, 2)] = true;
        }

        for(boolean found: arr) {
            if(!found)
                return false;
        }
        return true;
    }
}
