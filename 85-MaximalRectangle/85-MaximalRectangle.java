// Last updated: 8/5/2026, 2:14:21 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int max = 0;

        for (char[] row : matrix) {

            for (int i = 0; i < cols; i++) {
                if (row[i] == '1')
                    heights[i]++;
                else
                    heights[i] = 0;
            }

            max = Math.max(max, largestRectangleArea(heights));
        }

        return max;
    }

    private int largestRectangleArea(int[] heights) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int max = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }

            stack.push(i);
        }

        return max;
    }
}