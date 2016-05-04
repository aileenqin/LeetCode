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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return sum;
        }
        calculate(root, 0);
        return sum;
    }
    public void calculate(TreeNode root, int num) {
        num = 10 * num + root.val;
        if (root.left == null && root.right == null) {
            sum += num;
        }
        if (root.left != null) {
            calculate(root.left, num);
        }
        if (root.right != null) {
            calculate(root.right, num);
        }
    }
}
