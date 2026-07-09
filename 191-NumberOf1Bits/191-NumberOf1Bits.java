// Last updated: 7/9/2026, 10:40:40 AM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }

        return count;
    }
}