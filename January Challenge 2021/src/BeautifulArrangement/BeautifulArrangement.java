package BeautifulArrangement;

public class BeautifulArrangement {
    int ans = 0;
    public int countArrangement(int n) {
        backtrack(n, 1, new boolean[n+1]);
        return ans;
    }

    private void backtrack(int n, int loc, boolean[] visited) {
        if(loc == n+1)
            ans++;
        else {
            for(int x=1; x<=n; x++) {
                if(visited[x] || (x % loc != 0 && loc % x != 0)) continue;
                visited[x] = true;
                backtrack(n, loc+1, visited);
                visited[x] = false;
            }
        }
    }
}
