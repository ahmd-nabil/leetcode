package PeekingIterator;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> itr;
    private Integer peekedInt;
    private boolean hasPeeked;
    public PeekingIterator(Iterator<Integer> iterator) {
        this.itr = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(!hasPeeked) {
            hasPeeked = true;
            peekedInt = itr.next();
        }
        return peekedInt;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(hasPeeked) {
            Integer res = peekedInt;
            hasPeeked = false;
            peekedInt = null;
            return res;
        }
        return itr.next();
    }

    @Override
    public boolean hasNext() {
        return hasPeeked || itr.hasNext();
    }
}
