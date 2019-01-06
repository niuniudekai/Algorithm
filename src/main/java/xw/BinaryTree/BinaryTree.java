package xw.BinaryTree;

/**
 * 使用链表实现的二叉树
 */
public class BinaryTree {

    TreeNode root = null;

    /**以默认的构造器创建*/
    public BinaryTree(){
        this.root = new TreeNode();
    }

    /**以指定根元素创建 */
    public BinaryTree(int data){
        this.root = new TreeNode(data);
    }

    /**判断二叉树是否为空  */
    public boolean isEmpty(){
        return root == null;
    }

    /**获取根节点 */
    public TreeNode getRoot(){
        if(isEmpty()){
            throw new RuntimeException("树为空，无法获取根节点！");
        }
        return root;
    }

    /**获取指定节点的深度*/
    private int getNodeDeep(TreeNode root){
        if(root == null){
            return 0;
        }

        if(root.getRight() == null && root.getLeft() == null){
            return 1;
        }else{
            int leftDeep = getNodeDeep(root.getLeft());
            int rightDeep = getNodeDeep(root.getRight());

            int max = leftDeep > rightDeep ? leftDeep : rightDeep;
            return max + 1;
        }
    }

    /**获取树的深度*/
    private int getDeep(){
        if(root == null){
            return 0;
        }
        return getNodeDeep(root);
    }


    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree(1);
        TreeNode node1 = new TreeNode(2);
        binaryTree.getRoot().setLeft(node1);
        TreeNode node2 = new TreeNode(3);
        binaryTree.getRoot().setRight(node2);
        TreeNode node3 = new TreeNode(3);
        binaryTree.getRoot().getRight().setRight(node3);

        System.out.println(binaryTree.getDeep());
    }
}
