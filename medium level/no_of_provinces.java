// class Solution {
//     public int findCircleNum(int[][] isConnected) {
//         int c = 0; // assume all cities are connected
//         for (int i = 0; i < connected.length; i++) {
//             for (int j = 0; j < connected[i].length; j++) {
//                 if (isConnected[i][j] == 1 && isConnected[i][j + 1] == 1)
//                     c++;
//             }
//         }
//     }
// }


class Solution {
    public int findCircleNum(int[][] isConnected) {
        int c=0; //assume all cities are connected
        for(int i=0;i<connected.length;i++)
        {
            for(int j=0;j<connected[i].length;j++)
            {
                if(isConnected[i][j]==1 && isConnected[i][j+1]==1)
                c++;
            }
        }
    }
}