package BrokenCalculator;

public class BackwardsSolution {
    /**
     * I would like to add some explanations for working backwards:
     * If with subtraction and multiplication, the effect of earlier subtraction will be amplified by later
     * multiplications,hence, greedily doing multiplication might not reach optimal solution as an additional
     * early subtraction can have a huge effect.
     * Whereas with addition and division, earlier addition will be diminished by later divisions.
     * It is thus always better to do division wherever possible.
     *
     * By Alex Cai
    * */
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
