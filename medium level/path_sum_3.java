/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int count = 0;

    void dfs(TreeNode node, long currsum, int targetSum) {
        if (node == null)
            return;
        currsum += node.val;
        if (currsum == targetSum) {
            count++;
        }

        // else if(node.val+currsum<targetSum)
        // currsum+=node.val;
        // else
        // currsum=0;

        dfs(node.left, currsum, targetSum);
        dfs(node.right, currsum, targetSum);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;

        dfs(root, 0, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }
}