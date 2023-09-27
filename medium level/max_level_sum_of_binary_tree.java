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
    int maxsum = Integer.MIN_VALUE, level = 1, maxlev = 1;

    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;

        // works only for 2 levels
        // if(root.left==null && root.right==null) return 1;
        // if(root.left!=null && root.right!=null && root.left.val+root.right.val>=sum)
        // {
        // sum=root.left.val+root.right.val;
        // level++;
        // }
        // maxLevelSum(root.left);
        // maxLevelSum(root.right);

        // for tree with > 2 levels
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSum = 0;
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);

            }

            if (levelSum > maxsum) {
                maxsum = levelSum;
                maxlev = level;
            }

            level++;
        }

        return maxlev;
    }
}