package FlattenNestedListIterator;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// Note1: This implementation could be done with List
// Note2: TODO optimize it to iterate over the original data (without copying the whole thing)
// https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/594/week-2-april-8th-april-14th/3706/discuss/80146/Real-iterator-in-Python-Java-C++
public class NestedIterator implements Iterator<Integer> {
    private Stack<NestedInteger> stack = new Stack<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        flatten(nestedList);
    }

    private void flatten(List<NestedInteger> nestedList) {
        for(int i = nestedList.size()-1; i>=0; i--) {
            if(nestedList.get(i).isInteger())
                stack.add(nestedList.get(i));
            else
                flatten(nestedList.get(i).getList());
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}