package MaxAreaOfIsland;
// Time Complexity: O(m * n), where m is the number of rows in grid, and n is the number of columns in grid
// Space Complexity: O(m * n)
public class DFSSolution {
    int[][] grid;
    boolean[][] seen;
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        this.seen = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                ans = Math.max(ans, area(r, c));
            }
        }
        return ans;
    }

    private int area(int r, int c) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || seen[r][c])
            return 0;
        seen[r][c] = true;
        return 1 + area(r+1, c)
                + area(r-1, c)
                + area(r, c+1)
                + area(r, c-1);
    }
}
