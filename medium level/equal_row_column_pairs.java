import java.util.HashMap;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // faster approach but complicated
        // for(int [] row: grid){
        // String rowStr = Arrays.toString(row);
        // hashMap.put(rowStr, hashMap.getOrDefault(rowStr,0)+1);
        // }

        // int count = 0;
        // for(int j = 0;j<n;j++){
        // int [] col = new int[n];
        // for(int i = 0;i<n;i++){
        // col[i] = grid[i][j];
        // }
        // count+=hashMap.getOrDefault(Arrays.toString(col),0);
        // }
        // return count;

        for (int i = 0; i < grid[0].length; i++) {
            String str = "";

            for (int j = 0; j < n; j++)
                str += grid[j][i] + ","; // append every column values to str from row0

            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        int count = 0;
        // again check for the row values from columns of row0
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0; j < grid[0].length; j++)
                str += grid[i][j] + ",";

            if (hm.containsKey(str))
                count += hm.get(str);
        }
        return count;
    }
}