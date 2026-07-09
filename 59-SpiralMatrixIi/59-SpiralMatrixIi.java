// Last updated: 7/9/2026, 10:41:20 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                res[top][i] = val++;
            top++;

            for (int i = top; i <= bottom; i++)
                res[i][right] = val++;
            right--;

            for (int i = right; i >= left; i--)
                res[bottom][i] = val++;
            bottom--;

            for (int i = bottom; i >= top; i--)
                res[i][left] = val++;
            left++;
        }

        return res;
    }
}