package CourseSchedule;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int n, int[][] pres) {
        int[] weight = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++) map.put(i, new ArrayList<>());

        for(int[] pre: pres) {
            weight[pre[0]]++;
            map.get(pre[1]).add(pre[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++)
            if(weight[i] == 0)
                queue.add(i);

        int taken = 0;
        while(!queue.isEmpty()) {
            List<Integer> nextCoursesList = map.get(queue.poll());
            taken++;
            for(int c: nextCoursesList) {
                if(--weight[c] == 0)
                    queue.add(c);
            }
        }
        return taken == n;
    }
}

/*
*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?



Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take.
             To take course 1 you should have finished course 0. So it is possible.


Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
*
* */