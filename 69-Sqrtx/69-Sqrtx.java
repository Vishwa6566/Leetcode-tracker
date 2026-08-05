// Last updated: 8/5/2026, 2:15:34 PM
class Solution {
    public int mySqrt(int x) {

        if (x < 2)
            return x;

        long left = 1;
        long right = x;

        while (left <= right) {

            long mid = (left + right) / 2;

            if (mid * mid == x)
                return (int) mid;

            if (mid * mid < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return (int) right;
    }
}