// Last updated: 8/5/2026, 1:58:30 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        int shift = 0;

        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }

        return left << shift;
    }
}