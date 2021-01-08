package MergeIntervals;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Queue<int[]> pq = new PriorityQueue<>((a, b)->a[0]<=b[0]?-1:1); // will make sure first                                                      // element has the minimum start
        for(int[] interval: intervals)
            pq.add(interval);


        int start = pq.peek()[0], end = pq.poll()[1];

        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            if(end >= cur[0]) { // overlapping intervals (time to merge start & end)
                start = Math.min(start, cur[0]);
                end = Math.max(end, cur[1]);
            } else {
                res.add(new int[]{start, end});
                start = cur[0];
                end = cur[1];
            }
        }
        res.add(new int[]{start, end}); // for the last interval (won't be checked)

        int[][] resArr = new int[res.size()][2];
        for(int i=0; i<res.size(); i++) {
            int[] r = res.get(i);
            resArr[i][0] = r[0];
            resArr[i][1] = r[1];
        }
        return resArr;
    }
}
/*
Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
*/