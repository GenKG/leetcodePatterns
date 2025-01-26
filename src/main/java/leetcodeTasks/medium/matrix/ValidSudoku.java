package leetcodeTasks.medium.matrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        Map<Character,Set<Character>> column = new HashMap<>();
        Map<Character,Set<Character>> row = new HashMap<>();
        Map<Character,Set<Character>> box = new HashMap<>();
        for(int i = 0; i < 9;i++){
            column.computeIfAbsent(Character.forDigit(i, 9),(f) -> new HashSet<>());
            row.computeIfAbsent(Character.forDigit(i, 9),(f) -> new HashSet<>());
            box.computeIfAbsent(Character.forDigit(i, 9),(f) -> new HashSet<>());
        }

        for(int i = 0; i < 9;i++){
            for(int j = 0; j < 9;j++){
                char val = board[i][j];
                Character rowI = Character.forDigit(i,9);
                if(val == '.'){
                    continue;
                }
                if(row.get(rowI).contains(val)){
                    return false;
                }
                row.get(rowI).add(val);


                Character columnJ = Character.forDigit(j,10);
                if(column.get(columnJ).contains(val)){
                    return false;
                }
                column.get(columnJ).add(val);

                int idx = (i / 3) * 3 + j / 3;
                char currentBox = Character.forDigit(idx,10);
                if(box.get(currentBox).contains(val)){
                    return false;
                }
                box.get(currentBox).add(val);
            }
        }
        return true;
    }
}
