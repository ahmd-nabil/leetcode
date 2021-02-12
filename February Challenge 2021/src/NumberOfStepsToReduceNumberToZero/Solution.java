package NumberOfStepsToReduceNumberToZero;

public class Solution {
    public int solution1 (int num) {
        int cnt = 0;
        while(num > 0) {
            if(num % 2 == 0) num /= 2;
            else num--;
            cnt++;
        }
        return cnt;
    }

    public int solution2 (int num) {
        int steps = 0;
        while(num > 0) {
            steps += (num % 2 == 0 || num == 1) ? 1 : 2; // if even or 1 => 1 step, any odd number except 1 => 2 steps
            num >>= 1;
        }
        return steps;
    }
}
