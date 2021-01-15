package GetMaximumInGeneratedArray;

public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if(n <= 1) return n;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int res = Integer.MIN_VALUE;
        for(int i=2; i<n+1; i++) {
            arr[i] = arr[i/2];
            if((i&1) == 1) {
                arr[i] += arr[i/2+1];
            }

            res = Math.max(res, arr[i]);
        }
        return res;
    }
}
