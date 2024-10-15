// solution works only for small number arrays
//class Solution {
//     public int findCircleNum(int[][] isConnected) {
//         int cp=0; 
//         int n = isConnected.length;

//         for(int i=0;i<n;i++)
//         {
//             boolean has_conn=false;
//             for(int j=0;j<n;j++)
//             {
//                 if(isConnected[i][j]==1 && i!=j)
//                 {
//                     has_conn=true;
//                     break; // as direct conection exists it is not a separate province so no cp++
//                 }
//             }

//             if(has_conn==false)
//             cp++;

//             else {
//                 for (int j = 0; j < n; j++) {
//                     if (isConnected[i][j] == 1 && i != j) {
//                         isConnected[j][i] = 0;
//                         isConnected[i][j] = 0;
//                     }
//                 }
//             }
//         }

//         return cp;
//     }
// }

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[city][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }
}