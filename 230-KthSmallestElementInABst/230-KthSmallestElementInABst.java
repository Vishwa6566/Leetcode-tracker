// Last updated: 8/5/2026, 1:56:37 PM
import java.util.*;

class Solution {

    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();

        while (true) {

            while (root != null) {

                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            if (--k == 0)
                return root.val;

            root = root.right;
        }
    }
}