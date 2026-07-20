class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int n = grid.length;
        int m = grid[0].length;

        while (k-- > 0) {

            int temp = grid[n - 1][m - 1];

            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {

                    if (i == 0 && j == 0) {
                        grid[0][0] = temp;
                    }
                    else if (j == 0) {
                        grid[i][0] = grid[i - 1][m - 1];
                    }
                    else {
                        grid[i][j] = grid[i][j - 1];
                    }
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                row.add(grid[i][j]);
            }

            res.add(row);
        }

        return res;
    }
}