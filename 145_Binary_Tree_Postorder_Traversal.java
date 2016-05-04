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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
		
        if (root == null) {
            return list;
        }
        stack.push(root);  //last to be visited
        while (stack.size() != 0) {
            TreeNode top = stack.peek();    //look at the object at the top of this stack
            if (top.left == null && top.right == null) {
                list.add(top.val);     //direct visit if no children
                stack.pop();     //removes object
            }
            if (top.right != null) {
                stack.push(top.right);
                top.right = null;
                continue;
            }
            if (top.left != null) {
                stack.push(top.left);
                top.left = null;
                continue;
            }
        }
        return list;
    }
}
