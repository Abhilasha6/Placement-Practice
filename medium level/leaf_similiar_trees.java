class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<Integer>();
        List<Integer> leafs2 = new ArrayList<Integer>();
        dfs(root1, leafs1);
        dfs(root2, leafs2);
        return leafs1.equals(leafs2);
    }

    public void dfs(TreeNode root, List leafs) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafs.add(root.val);
        }
        dfs(root.right, leafs);
        dfs(root.left, leafs);
    }
}