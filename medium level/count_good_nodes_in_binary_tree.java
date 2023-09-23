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
    // ArrayList<Integer> a1=new ArrayList<>();
    boolean flag = true;
    int c = 0;

    void dfs(TreeNode node, int currmax) {
        if (node == null)
            return;
        if (node.val >= currmax) {
            c++;
            currmax = node.val;
        }
        dfs(node.left, currmax);
        dfs(node.right, currmax);
    }

    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root, root.val);
        // else if(root.left==null && root.right==null)
        // {
        // a1.add(root.val);
        // for(int i=0;i<a1.size()-1;i++)
        // if(a1.get(i+1)>=a1.get(i))
        // c++;
        // // flag=false;

        // // if(flag==true) c++;
        // }
        // else
        // a1.add(root.val);
        // goodNodes(root.left);
        // goodNodes(root.right);

        return c;
    }
}