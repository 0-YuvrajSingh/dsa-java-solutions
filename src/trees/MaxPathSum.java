// Pattern: Tree Recursion (Path Sum Variant)
// Difficulty: Hard

class MaxPathSum {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        computeMaxPath(root);
        return maxSum;
    }

    private int computeMaxPath(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, computeMaxPath(node.left));
        int right = Math.max(0, computeMaxPath(node.right));

        maxSum = Math.max(maxSum, left + right + node.val);

        return node.val + Math.max(left, right);
    }
}