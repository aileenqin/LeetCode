public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		if (root == null)
			return list;
		stack.push(root);
		while (stack.size() != 0) {
			TreeNode top = stack.pop();
			list.add(top.val);
			if (top.right != null) {
				stack.push(top.right);
			}
			if (top.left != null) {
				stack.push(top.left);
			}
		}
		return list;
    }
}