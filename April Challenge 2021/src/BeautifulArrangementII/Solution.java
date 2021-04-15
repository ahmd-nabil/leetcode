package BeautifulArrangementII;

public class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        for(int i=0, l=1, r=n; i<n; i++) {
            res[i] = k > 0 ? (((k--&1)==0)?r--:l++) : l++;
        }
        return res;
    }
}
