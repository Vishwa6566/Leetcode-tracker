// Last updated: 8/5/2026, 2:03:13 PM
import java.util.*;

class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        return build(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd,
                           int inStart, int inEnd) {

        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int index = map.get(root.val);
        int leftSize = index - inStart;

        root.left = build(preorder,
                preStart + 1,
                preStart + leftSize,
                inStart,
                index - 1);

        root.right = build(preorder,
                preStart + leftSize + 1,
                preEnd,
                index + 1,
                inEnd);

        return root;
    }
}