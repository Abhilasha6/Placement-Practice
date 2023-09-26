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

// works only for balanced tree
class Solution {
    int c = 0;
    List<Integer> arr = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return arr;
        if (c == 0)
            arr.add(root.val);
        if (root.right != null) {
            arr.add(root.right.val);
            c++;
            rightSideView(root.right);
        }
        // if(root.left!=null)
        // rightSideView(root.left);
        // arr.add(root.val);
        return arr;
    }
}