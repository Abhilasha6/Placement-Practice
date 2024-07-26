class Solution {
    public int orangesRotting(int[][] grid) {

        // check for length of grid
        if (grid == null || grid.length == 0)
            return -1;

        int m = grid.length, n = grid[0].length;
        int minutes = 0;
        boolean visited;

        do {
            // we assume cells are not previously visited
            visited = false;
            int[][] tempGrid = new int[m][n];

            // Copy grid to tempGrid
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    tempGrid[i][j] = grid[i][j];
                }
            }

            // Iterate through grid to rot adjacent fresh oranges
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // Search for rotten orange, rot its nearby 4 oranges and mark them visited
                    if (grid[i][j] == 2) {
                        if (i > 0 && grid[i - 1][j] == 1) {
                            tempGrid[i - 1][j] = 2;
                            visited = true;
                        }
                        if (i < m - 1 && grid[i + 1][j] == 1) {
                            tempGrid[i + 1][j] = 2;
                            visited = true;
                        }
                        if (j > 0 && grid[i][j - 1] == 1) {
                            tempGrid[i][j - 1] = 2;
                            visited = true;
                        }
                        if (j < n - 1 && grid[i][j + 1] == 1) {
                            tempGrid[i][j + 1] = 2;
                            visited = true;
                        }
                    }
                }
            }

            // Copy tempGrid back to grid
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = tempGrid[i][j];
                }
            }

            // If the cell is visited already then it is already rotten by some other orange
            // Since it is already rotten, we can consider it for incrementing minutes by 1
            if (visited) {
                minutes++;
            }
        } while (visited);

        // Check if any fresh oranges are left after visiting all rotten oranges
        // If yes then return -1
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1)
                    return -1;
            }
        }
        // else return the total minutes consumed for rotting all oranges
        return minutes;
    }
}
