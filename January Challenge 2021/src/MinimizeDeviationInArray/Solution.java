package MinimizeDeviationInArray;

import java.util.PriorityQueue;
/**
 * multiple odd numbers by 2, so they are even, and now all numbers will get only smaller (divided by 2)
 * as we have biggest possible number, we can keep track of minimum only, and use PriorityQueue to get the maximum number
 */
public class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);   // pq.poll() will return maximum
        int mn = Integer.MAX_VALUE, deviation = Integer.MAX_VALUE;
        for(int x: nums) {
            if((x&1) == 1) x *= 2;
            pq.add(x);
            mn = Math.min(mn, x);
        }

        while(true) {
            int mx = pq.poll();
            deviation = Math.min(deviation, mx - mn);
            if((mx&1) == 1) break;  // if the number is odd => it cant get smaller => remaining numbers will never be maximum
            mn = Math.min(mn, mx/2);
            pq.add(mx/2);
        }
        return deviation;
    }
}
