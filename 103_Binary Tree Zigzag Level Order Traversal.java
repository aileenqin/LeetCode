public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return result;
		}
		boolean odd = true;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> level = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				level.add(node.val);
				if (node.left != null) {
					q.offer(node.left);
				}
				if (node.right != null) {
					q.offer(node.right);
				}
			}
			if (odd == true) {
				result.add(level);
			} else {
				Collections.reverse(level);
				result.add(level);
			}
			odd = !odd;
		}
		return result;
    }
}