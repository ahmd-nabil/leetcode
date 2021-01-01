package com.noble.CheckArrayFormationThroughConcatenation;

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
