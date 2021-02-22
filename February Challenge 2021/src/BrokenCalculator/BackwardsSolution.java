package BrokenCalculator;

public class BackwardsSolution {
    public int brokenCalc(int x, int y) {
        int ans = 0;
        while(y > x) {
            if((y&1) == 1) {
                y += 1;
            } else {
                y /= 2;
            }
            ans++;
        }
        return ans + x - y;
    }
}
