package CourseScheduleIII;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IterativeSolution {
    public int scheduleCourse(int[][] courses) {
        // sort courses according to end day
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        int time = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a);
        // for each course, if it can be taken, take it
        for(int[] course: courses) {
            if(course[0] + time <= course[1]) {
                pq.add(course[0]);
                time += course[0];
            } else if(!pq.isEmpty() && course[0] < pq.peek()) {
                //if cant be taken, swap current course with bigger one in the pq, gives the same res, and also                 saves time
                time -= (pq.poll() - course[0]);
                pq.add(course[0]);
            }
        }
        return pq.size();
    }
}
