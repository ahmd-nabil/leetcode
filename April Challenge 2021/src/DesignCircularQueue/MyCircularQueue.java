package DesignCircularQueue;

import java.util.Arrays;

public class MyCircularQueue {
    private int read;
    private int write;
    private int[] A;

    public MyCircularQueue(int k) {
        read = 0;
        write = 0;
        A = new int[k];
        Arrays.fill(A, -1);
    }

    public boolean enQueue(int value) {
        if(write == A.length) {
            if(A[0] != -1)
                return false;
            write %= A.length;
        }
        if(A[write] != -1)
            return false;
        A[write++] = value;
        return true;
    }

    public boolean deQueue() {
        if(A[read] == -1)
            return false;
        A[read] = -1;
        read++;
        read %= A.length;
        return true;
    }

    public int Front() {
        if(A[read] == -1)
            return -1;
        return A[read];
    }

    public int Rear() {
        if(A[write-1] == -1)
            return -1;
        return A[write-1];
    }

    public boolean isEmpty() {
        return A[read] == -1;
    }

    public boolean isFull() {
        return (read == write && A[read] != -1) || (write == A.length && read == 0 && A[read] != -1);
    }
}