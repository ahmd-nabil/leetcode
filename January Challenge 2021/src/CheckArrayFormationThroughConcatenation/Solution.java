package CheckArrayFormationThroughConcatenation;

import java.util.Arrays;

public class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] loc = new int[101];
        Arrays.fill(loc, -1);
        for(int i=0; i<pieces.length; i++)
            loc[pieces[i][0]] = i;      //keeping index of starter element of each piece

        for(int i=0; i<arr.length;) {
            int p = loc[arr[i]]; // get the location of the piece containing our element
            if(p == -1) return false; // means can't find our element in pieces

            int j = 0;
            while(j < pieces[p].length)
                if(arr[i++] != pieces[p][j++])
                    return false;
        }
        return true;
    }
}


/**

 You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct.
 Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].
 Return true if it is possible to form the array arr from pieces. Otherwise, return false.


 Example 1:

 Input: arr = [85], pieces = [[85]]
 Output: true
 Example 2:

 Input: arr = [49,18,16], pieces = [[16,18,49]]
 Output: false
 Explanation: Even though the numbers match, we cannot reorder pieces[0].
 Example 4:

 Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
 Output: true
 Explanation: Concatenate [91] then [4,64] then [78]
 Example 5:

 Input: arr = [1,3,5,7], pieces = [[2,4,6,8]]
 Output: false

 **/
