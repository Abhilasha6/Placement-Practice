class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        // Check for empty maze
        if (maze == null || maze.length == 0)
            return -1;

        int rows = maze.length, columns = maze[0].length;
        int steps = 0;
        boolean[][] visited = new boolean[rows][columns];
        visited[entrance[0]][entrance[1]] = true;

        // Directions for moving up, down, left, and right
        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        // List to track current layer of cells to process
        List<int[]> currentLayer = new ArrayList<>();
        currentLayer.add(entrance);

        while (!currentLayer.isEmpty()) {
            steps++;
            List<int[]> nextLayer = new ArrayList<>();

            for (int[] current : currentLayer) {
                for (int[] direction : directions) {
                    int x = current[0] + direction[0];
                    int y = current[1] + direction[1];

                    // Check if out of bounds or visited or wall
                    if (x < 0 || x >= rows || y < 0 || y >= columns || maze[x][y] == '+' || visited[x][y]) {
                        continue;
                    }

                    // Check if it's an exit (on the border and not the entrance)
                    if ((x == 0 || x == rows - 1 || y == 0 || y == columns - 1)
                            && !(x == entrance[0] && y == entrance[1])) {
                        return steps;
                    }

                    // Mark as visited and add to next layer
                    visited[x][y] = true;
                    nextLayer.add(new int[] { x, y });
                }
            }
            // Move to the next layer
            currentLayer = nextLayer;
        }

        return -1;
    }
}
