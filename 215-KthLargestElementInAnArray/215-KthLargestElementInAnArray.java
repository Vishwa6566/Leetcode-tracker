// Last updated: 8/5/2026, 1:57:29 PM
import java.util.*;

class Solution {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {

            pq.offer(num);

            if (pq.size() > k)
                pq.poll();
        }

        return pq.peek();
    }
}