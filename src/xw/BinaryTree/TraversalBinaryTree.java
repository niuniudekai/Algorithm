package xw.BinaryTree;

import java.util.Stack;

/**
 * 遍历二叉树
 */
public class TraversalBinaryTree {
    /**
     * 前序遍历二叉树（递归）
     */
    public static void PrintBinaryTreePreRecur(TreeNode root)
    {
        if (root!=null)
        {
            System.out.print(root.getData());
            PrintBinaryTreePreRecur(root.getLeft());
            PrintBinaryTreePreRecur(root.getRight());
        }
    }

    /**
     * 前序遍历二叉树（非递归）
     */
    public static void PrintBinaryTreePreRecur2(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();

        if(root != null){
            stack.push(root);
            while (!stack.isEmpty()){
                TreeNode node = stack.pop();
                System.out.print(node.getData());
                if (node.getRight() != null){
                    stack.push(node.getRight());
                }
                if (node.getLeft() != null){
                    stack.push(node.getLeft());
                }
            }
        }
    }

    /**
     * 中序遍历二叉树（递归）
     */
    public static void PrintBinaryTreeMidRecur(TreeNode root)
    {
        if (root!=null)
        {
            PrintBinaryTreeMidRecur(root.getLeft());
            System.out.print(root.getData());
            PrintBinaryTreeMidRecur(root.getRight());
        }
    }

    /**
     * 中序遍历二叉树（非递归）
     */
    public static void PrintBinaryTreeMidRecur2(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.empty())
        {
            while (root != null)
            {
                stack.push(root);
                root = root.getLeft();
            }
            if(!stack.empty())
            {
                root = stack.pop();
                System.out.print(root.getData());
                root = root.getRight();
            }
        }
    }
    /**
     * 后序遍历二叉树（递归）
     */
    public static void PrintBinaryTreeBacRecur(TreeNode root)
    {
        if (root!=null)
        {
            PrintBinaryTreeBacRecur(root.getLeft());
            PrintBinaryTreeBacRecur(root.getRight());
            System.out.print(root.getData());
        }
    }

    /**
     * 后序遍历二叉树（非递归）
     */
    public static void PrintBinaryTreeBacRecur2(TreeNode root)
    {
        Stack<TreeNode> stackL = new Stack<>();
        Stack<Integer> stackR = new Stack<>();

        while (root != null || !stackL.isEmpty()){

            while (root != null){
                stackL.push(root);
                stackR.push(0);
                root = root.getLeft();
            }

            while(!stackL.empty() && stackR.peek() == 1)
            {
                stackR.pop();
                System.out.print(stackL.pop().getData());
            }

            if(!stackL.empty())
            {
                stackR.pop();
                stackR.push(1);
                root = stackL.peek();
                root = root.getRight();
            }
        }
    }


    
    
    public static void main(String[] args){  
        BinaryTree binaryTree = new BinaryTree(1);
        TreeNode root = binaryTree.getRoot();
        root.setLeft(2);
        root.setRight(3);
        TreeNode left = root.getLeft();
        left.setLeft(4);
        left.setRight(5);
        TreeNode right = root.getRight();
        right.setLeft(7);
        right.setRight(8);

        PrintBinaryTreePreRecur(root);
        System.out.println();
        PrintBinaryTreeMidRecur(root);
        System.out.println();
        PrintBinaryTreeBacRecur(root);
        System.out.println();
        PrintBinaryTreePreRecur2(root);
        System.out.println();
        PrintBinaryTreeMidRecur2(root);
        System.out.println();
        PrintBinaryTreeBacRecur2(root);
        System.out.println();

    }
}
