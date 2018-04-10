package xw.BinaryTree;

/**
 * 二叉树的结点
 */
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){}

    public TreeNode(int data){
        this.data = data;
    }

    /**添加子结点*/
    public TreeNode addNode(TreeNode parent, int data, boolean isLeft){
        if(parent == null){
            throw new RuntimeException(parent + "节点为空，不能添加子节点！");
        }

        if(isLeft && parent.left != null){
            throw new RuntimeException(parent + "节点已有左子节点，不能添加左子节点！");
        }

        if(!isLeft && parent.right != null){
            throw new RuntimeException(parent + "节点已有右子节点，不能添加右子节点！");
        }

        TreeNode newNode = new TreeNode(data);

        if(isLeft){
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }

        return newNode;
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

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
