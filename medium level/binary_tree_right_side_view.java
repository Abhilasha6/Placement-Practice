import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  * int val;
//  * TreeNode left;
//  * TreeNode right;
//  * TreeNode() {}
//  * TreeNode(int val) { this.val = val; }
//  * TreeNode(int val, TreeNode left, TreeNode right) {
//  * this.val = val;
//  * this.left = left;
//  * this.right = right;
//  * }
//  * }
//  */

// works only for balanced tree
// class Solution {
// int c = 0;
// List<Integer> arr = new ArrayList<>();

// public List<Integer> rightSideView(TreeNode root) {
// if (root == null)
// return arr;
// if (c == 0)
// arr.add(root.val);
// if (root.right != null) {
// arr.add(root.right.val);
// c++;
// rightSideView(root.right);
// }
// return arr;
// }
// }

// for unbalanced tree
class Solution {
    void dfs(TreeNode node, List<Integer> arr, int depth) {
        if (node == null)
            return;
        if (depth == arr.size())
            arr.add(node.val);
        dfs(node.right, arr, depth + 1);
        dfs(node.left, arr, depth + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null)
            return arr;
        dfs(root, arr, 0);
        return arr;
    }
}