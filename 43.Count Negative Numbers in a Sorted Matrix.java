//43.Leetcode
//1351. Count Negative Numbers in a Sorted Matrix
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j= 0;j < grid[i].length; j++) {
                if(grid[i][j] < 0) count++;
            }
        }
        return count;
    }
}
