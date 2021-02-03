package CanYouEatYourFavoriteCandyOnYourFavoriteDay;

public class PrefixSum {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        long[] prev = new long[n];
        prev[0] = 0;
        for(int i=1; i<n; i++) {
            prev[i] = prev[i-1] + candiesCount[i-1];
        }

        boolean[] ans = new boolean[queries.length];
        int q = 0;
        for(int[] query : queries) {
            int i = query[0], day = query[1]+1, cap = query[2];
            /**
             * False IFF:
             * 1 - prev candies are too few that you finish all of it (including the fav candy) before fav the day
             * 2- prev candies are too many that you can't finish all of it before the fav day
             * */
            if(prev[i] + candiesCount[i] < day || prev[i] >= (long)day * cap)
                ans[q++] = false;
            else
                ans[q++] = true;
        }
        return ans;
    }
}
