// Last updated: 8/5/2026, 2:00:54 PM
class Solution {

    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode(0);

        while (head != null) {

            ListNode curr = head;
            head = head.next;

            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < curr.val)
                prev = prev.next;

            curr.next = prev.next;
            prev.next = curr;
        }

        return dummy.next;
    }
}