package xw.BinaryTree;

import java.util.*;

/**
 * 给出一棵二叉树，返回其节点值的锯齿形层次遍历（先从左往右，下一层再从右往左，层与层之间交替进行）
 */
public class zigzagLevelOrder {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return null;
        }

        List<List<Integer>> result = new LinkedList<List<Integer>>();

        boolean flag = true;//用于判断向左还是向右
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> list = new LinkedList<Integer>();
            int len = queue.size();

            //遍历当层
            while(len != 0){
                TreeNode node = queue.poll();
                len--;
                list.add(node.getData());
                if(node.getLeft() != null){
                    queue.offer(node.getLeft());
                }
                if(node.getRight() != null){
                    queue.offer(node.getRight());
                }
            }

            if(flag){
                result.add(list);
            }else{
                Collections.reverse(list);
                result.add(list);
            }
            flag = !flag;
        }

        return result;
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.getRoot();
        root.setData(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        TreeNode left = root.getLeft();
        TreeNode right = root.getRight();

        left.setLeft(new TreeNode(5));
        left.setRight(new TreeNode(6));
        right.setLeft(new TreeNode(7));
        right.setRight(new TreeNode(8));


        List<List<Integer>> result = zigzagLevelOrder(root);

        for (List list : result){
            System.out.printf("[");
            for(Object a : list){
                System.out.printf(a + ",");
            }
            System.out.println("]");
        }
    }
}
