package NextGreaterElement1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextBigger = new HashMap<>();
        Stack<Integer> stack = new Stack<>(); // stack to keep all next bigger items.
        for(int i=nums2.length-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums2[i]) stack.pop();
            if(!stack.isEmpty())
                nextBigger.put(nums2[i], stack.peek());
            else
                nextBigger.put(nums2[i], -1);
            stack.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++) {
            nums1[i] = nextBigger.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}

// N: length of nums1
// M: length of nums2
// O(N + M)
// https://leetcode.com/problems/next-greater-element-i/