package MaximumFrequencyStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class FreqStack {
    private Map<Integer, Integer> count; // x: count(x)
    private Map<Integer, Stack<Integer>> stacks;    // count c: stack of numbers with count c
    private int maxCount;

    public FreqStack() {
        count = new HashMap<>();
        stacks = new HashMap<>();
        maxCount = 0;
    }

    public void push(int x) {
        count.put(x, count.getOrDefault(x, 0) + 1);
        int xCount = count.get(x);
        if(xCount > x)
            maxCount = xCount;
        stacks.computeIfAbsent(xCount, z-> new Stack()).push(x);
    }

    public int pop() {
        int x = stacks.get(maxCount).pop();
        count.put(x, maxCount - 1);
        if(stacks.get(maxCount).size() == 0)
            maxCount--;
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
