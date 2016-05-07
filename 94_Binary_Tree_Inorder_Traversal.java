public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		if (root == null)
			return list;
		TreeNode curt = root;
		
		while (stack.size() != 0) {
			while (curt != null) {
				stack.push(curt);
				curt = curt.left;
			}
			curt = stack.peek();
			stack.pop();
			result.add(curt.val);
			curt = curt.right;
		}
		return result;
    }
}