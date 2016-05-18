/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curt = root;
        if (root == null) {
            return;
        }
		stack.push(root);
		TreeNode prev = null;
		while (stack.size() != 0) {
			TreeNode top = stack.pop();
			if (top.right != null) {
				stack.push(top.right);
			}
			if (top.left != null) {
				stack.push(top.left);
			}
			if (prev != null) {
				prev.left = null;
				prev.right = top;
			}
			prev = top;
		}
	}
}