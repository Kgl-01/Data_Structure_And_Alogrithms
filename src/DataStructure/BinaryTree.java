package DataStructure;


class BinaryTree {
    static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
            leftChild = null;
            rightChild = null;
        }

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            leftChild = left;
            rightChild = right;
        }
    }

    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);
        TreeNode root = new TreeNode(1, leftChild, rightChild);


        BinaryTree tree = new BinaryTree(root);

        System.out.println("root value: " + tree.root.data);
        System.out.println("root left decendent value: " + tree.root.leftChild.data);
        System.out.println("root right decendent value: " + tree.root.rightChild.data);

    }
}