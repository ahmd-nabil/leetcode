package KthMissingPositiveNumber;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int n = 1;
        for(int i=0; i<arr.length;) {
            if(arr[i] != n) {
                k--;
                if(k == 0) return n;
            }
            else {
                i++;
            }
            n++;
        }
        return n + k - 1;
    }
}

/*
Better solution:
        for(int x: arr) {
            if(x <= k)
                k++;
            else
                break;
        }
        return k;
*/
/*
Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
*/