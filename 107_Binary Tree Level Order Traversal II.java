public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList list = new ArrayList();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = queue.size();   //before taking out a node from queue, store the size
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();   
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);  //adding the children to the queue
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            list.add(0, level); //the only difference between the previous problem
        }

        return list;
    }
}