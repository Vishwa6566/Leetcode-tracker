// Last updated: 8/5/2026, 1:58:25 PM
class Solution {

    public int countPrimes(int n) {

        if (n <= 2)
            return 0;

        boolean[] prime = new boolean[n];

        java.util.Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                for (int j = i * i; j < n; j += i)
                    prime[j] = false;
            }
        }

        int count = 0;

        for (boolean p : prime)
            if (p)
                count++;

        return count;
    }
}