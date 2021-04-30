package FurthestBuildingYouCanReach;

import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> jumps = new PriorityQueue<>();
        for(int i=0; i<heights.length-1; i++) {
            if(heights[i] >= heights[i+1])
                continue;

            int jump = heights[i+1] - heights[i];
            jumps.add(jump);
            if(jumps.size() > ladders) {
                bricks -= jumps.poll();
            }

            if(bricks < 0)
                return i;
        }
        return heights.length - 1;
    }
}
