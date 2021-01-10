package FindMedianFromDataStream;

import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder {

    /** initialize your data structure here. */
    Queue<Integer> lo = new PriorityQueue<>((a, b) -> b-a); // peek() & poll() should give us the biggest element here (reverse order)
    Queue<Integer> hi = new PriorityQueue<>(); // peek() & poll() should give us the smallest number of biggest half (natural order)
    public MedianFinder() {
    }

    public void addNum(int num) {
        lo.offer(num);

        hi.offer(lo.poll());

        if(lo.size() < hi.size())
            lo.offer(hi.poll());
    }

    public double findMedian() {
        return lo.size() > hi.size() ? lo.peek(): 0.5 * (lo.peek()+hi.peek());
    }
}
/**
 Design a data structure that supports the following two operations:
    * void addNum(int num) - Add a integer number from the data stream to the data structure.
    * double findMedian() - Return the median of all elements so far.

 */
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */