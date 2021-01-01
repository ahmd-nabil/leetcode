package CourseScheduleII;

import java.util.*;

public class CourseScheduleII {
    public int[] findOrder(int n, int[][] pres) {
        int[] degree = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>(); // pre => nextCourses map
        for(int i=0; i<n; i++) map.put(i, new ArrayList<>());

        for(int i=0; i<pres.length; i++) {
            degree[pres[i][0]]++;
            map.get(pres[i][1]).add(pres[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();

        // loop to get courses that have no prerequisites (degree == 0)
        for(int c=0; c<degree.length; c++) {
            if(degree[c] == 0) {
                queue.add(c);
            }
        }

        List<Integer> topOrder = new ArrayList<>();
        while(!queue.isEmpty()) {
            int takenCourse = queue.poll();
            topOrder.add(takenCourse);
            List<Integer> nextCourseList = map.get(takenCourse);
            for(int c: nextCourseList) {
                --degree[c];
                if(degree[c] == 0) {
                    queue.add(c);
                }
            }
        }

        if(topOrder.size() != n) return new int[0];
        int[] res = new int[n];
        for(int i=0; i<n; i++)
            res[i] = topOrder.get(i);
        return res;
    }
}
