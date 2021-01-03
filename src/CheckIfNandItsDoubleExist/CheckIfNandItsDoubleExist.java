package CheckIfNandItsDoubleExist;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandItsDoubleExist {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Set<Integer> set = new HashSet<>();
            for(int i=0; i<arr.length; i++) {
                if(set.contains(arr[i]*2) || (arr[i]%2==0 && set.contains(arr[i]/2)))   // check if found n*2 then found double for our n
                    return true;                                                        // check contains(n/2) iff n is even then our n is the double
                set.add(arr[i]);
            }
            return false;
        }
    }
}
