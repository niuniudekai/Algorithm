package xw.BinaryTree;

/**
 * 输入二叉树的前序遍历序列和中序遍历序列，重建一个二叉树
 */
public class ReBuild {

    public static TreeNode reBuild(int[] pre, int[] mid){
        if(pre == null || mid == null || pre.length != mid.length){
            return null;
        }

        return reBuildTree(pre, 0, pre.length - 1,
                            mid, 0, mid.length - 1);

    }

    public static TreeNode reBuildTree(int[] pre, int startPre, int endPre,
                               int[] mid, int startMid, int endMid){
        if(startPre > endPre || startMid > endMid){
            return null;
        }

        TreeNode root = new TreeNode(pre[startPre]);
        for(int i = startMid; i <= endMid; i++){
            if(mid[i] == pre[startPre]){
                root.setLeft(reBuildTree(pre,startPre + 1,startPre + i - startMid,
                                         mid, startMid,i -1 ));

                root.setRight(reBuildTree(pre,startPre + i - startMid + 1,endPre,
                                          mid,i + 1,endMid));
            }
        }
        return root;
    }


    public static void main(String[] args){
        int[] pre = new int[]{1,2,4,5,3,6,7};
        int[] mid = new int[]{4,2,5,1,6,3,7};

        BinaryTree binaryTree = new BinaryTree(reBuild(pre, mid));

        //前序遍历这个重建的二叉树
        TraversalBinaryTree.PrintBinaryTreePreRecur(binaryTree.root);
        System.out.println();
        //中序
        TraversalBinaryTree.PrintBinaryTreeMidRecur(binaryTree.root);
        System.out.println();
        //后序
        TraversalBinaryTree.PrintBinaryTreeBacRecur(binaryTree.root);


    }
}
