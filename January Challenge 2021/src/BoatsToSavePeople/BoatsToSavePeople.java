package BoatsToSavePeople;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        /*
        Solution:
            first we sort people by their weight
            then while there are still people to save
                get a boat
                carry the heaviest person on the boat
                if we can, we carry the lightest person
        * */
        Arrays.sort(people);
        int count = 0;
        int l = 0, r = people.length - 1;

        while(l <= r) {
            count++;
            r--;
            if(people[l] + people[r] <= limit) {
                l++;
            }
        }
        return count;
    }
}
