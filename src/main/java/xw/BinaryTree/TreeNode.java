package xw.BinaryTree;

/**
 * 二叉树的结点
 */
public class TreeNode {
    private int data;
    private TreeNode left;
    private  TreeNode right;

    public TreeNode(){}

    public TreeNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public void setLeft(int data) {
        TreeNode left = new TreeNode(data);
        this.setLeft(left);
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setRight(int data) {
        TreeNode right = new TreeNode(data);
        this.setRight(right);
    }
}
