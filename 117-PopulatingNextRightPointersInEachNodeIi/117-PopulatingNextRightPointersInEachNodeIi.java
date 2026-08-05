// Last updated: 8/5/2026, 2:02:27 PM
class Solution {

    public Node connect(Node root) {

        if (root == null)
            return null;

        Node dummy = new Node(0);
        Node tail = dummy;
        Node curr = root;

        while (curr != null) {

            while (curr != null) {

                if (curr.left != null) {
                    tail.next = curr.left;
                    tail = tail.next;
                }

                if (curr.right != null) {
                    tail.next = curr.right;
                    tail = tail.next;
                }

                curr = curr.next;
            }

            curr = dummy.next;
            dummy.next = null;
            tail = dummy;
        }

        return root;
    }
}