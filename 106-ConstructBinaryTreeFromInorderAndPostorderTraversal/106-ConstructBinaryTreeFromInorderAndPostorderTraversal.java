// Last updated: 8/5/2026, 2:03:08 PM
import java.util.*;

class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        return helper(postorder, 0, postorder.length - 1,
                0, inorder.length - 1);
    }

    private TreeNode helper(int[] postorder,
                            int postStart,
                            int postEnd,
                            int inStart,
                            int inEnd) {

        if (postStart > postEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(postorder[postEnd]);

        int index = map.get(root.val);
        int leftSize = index - inStart;

        root.left = helper(postorder,
                postStart,
                postStart + leftSize - 1,
                inStart,
                index - 1);

        root.right = helper(postorder,
                postStart + leftSize,
                postEnd - 1,
                index + 1,
                inEnd);

        return root;
    }
}