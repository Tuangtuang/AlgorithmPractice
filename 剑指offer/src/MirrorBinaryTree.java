/**
 * @program: 剑指offer
 * @description: 镜像二叉树
 * @author: tyq
 * @create: 2019-11-01 16:13
 **/
public class MirrorBinaryTree {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }


    }
}
