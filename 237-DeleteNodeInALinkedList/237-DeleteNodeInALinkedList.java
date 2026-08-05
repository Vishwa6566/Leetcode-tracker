// Last updated: 8/5/2026, 12:40:03 PM
class Solution {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}