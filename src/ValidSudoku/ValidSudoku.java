package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                char num = board[i][j];
                if(num != '.') {
                    if(!seen.add(num + "inRow" + i) ||
                            !seen.add(num + "inCol" + j) ||
                            !seen.add(num+"inBlock"+i/3+j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
