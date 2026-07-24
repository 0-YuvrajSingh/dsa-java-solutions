// Pattern: BST Property / Inorder
// Difficulty: Medium

class KthSmallestInBST {
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null || count >= k) return;
        inorder(node.left, k);
        count++;
        if (count == k) { result = node.val; return; }
        inorder(node.right, k);
    }
}