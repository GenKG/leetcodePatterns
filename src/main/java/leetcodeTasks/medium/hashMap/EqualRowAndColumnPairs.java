package leetcodeTasks.medium.hashMap;

import java.util.*;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        equalPairs(new int[][]{{13,13}, {13,13}});
    }

    public static int equalPairs(int[][] grid) {
        Map<String,Integer> row = new HashMap<>();
        Map<String,Integer> column = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            String rowKey = Arrays.toString(grid[i]);
            row.put(rowKey,row.getOrDefault(rowKey,0) + 1);
            int[] tempArr = new int[grid.length];

            for (int j = 0; j < grid[i].length; j++) {
                tempArr[j] =  grid[j][i];
            }
            String columnKey = Arrays.toString(tempArr);
            column.put(columnKey,column.getOrDefault(columnKey,0) + 1);
        }
        int res = 0;
        for(Map.Entry<String,Integer> entry: row.entrySet()){
            if(column.containsKey(entry.getKey())){
                res += entry.getValue() * column.get(entry.getKey());
            }
        }
        return res;
    }
}
