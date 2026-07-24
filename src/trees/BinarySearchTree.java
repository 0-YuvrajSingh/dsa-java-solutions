// Pattern: BST Fundamentals (Insert, Search, Delete)
// Difficulty: Easy-Medium

class BinarySearchTree {
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    public boolean search(TreeNode root, int val) {
        if (root == null) return false;
        if (val == root.val) return true;
        if (val < root.val) return search(root.left, val);
        return search(root.right, val);
    }

    public TreeNode delete(TreeNode root, int val) {
        if (root == null) return null;
        if (val < root.val) root.left = delete(root.left, val);
        else if (val > root.val) root.right = delete(root.right, val);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }
        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public int floor(TreeNode root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.val == key) return root.val;
            else if (root.val > key) root = root.left;
            else { floor = root.val; root = root.right; }
        }
        return floor;
    }

    public int ceil(TreeNode root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.val == key) return root.val;
            else if (root.val < key) root = root.right;
            else { ceil = root.val; root = root.left; }
        }
        return ceil;
    }
}