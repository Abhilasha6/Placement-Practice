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

// with recursion
class Solution {
    int max = 0;

    void dfs(TreeNode node, int dir, int len) {
        if (node == null)
            return;
        max = Math.max(len, max);
        if (dir == 1) // if currently we arein right node
        {
            dfs(node.left, 0, len + 1);
            // if left child node exists, it will continue finding the longest zig zag path
            // and move to left node
            dfs(node.right, 1, 1);
            // if left node doesnt exist then move on to next right node with resetting the
            // length as 1
        } else {
            dfs(node.right, 1, len + 1);
            // if right node exists then continue finding the zig zag path & change the
            // direction
            dfs(node.left, 0, 1);
            // if right doesnt exists then move on to available left node & reset the length
            // = 1
        }
    }

    public int longestZigZag(TreeNode root) {
        dfs(root, 0, 0);
        // as root is topmost, we assume it begins with left node
        return max;
    }
}