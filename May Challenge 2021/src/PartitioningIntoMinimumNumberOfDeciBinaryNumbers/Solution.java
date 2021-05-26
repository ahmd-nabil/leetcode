package PartitioningIntoMinimumNumberOfDeciBinaryNumbers;

public class Solution {
    public int minPartitions(String n) {
        char res = '0';
        for(char c: n.toCharArray()) {
            if(c > res)
                res = c;
        }
        return res - '0';
    }
}
