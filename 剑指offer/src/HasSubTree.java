/**
 * @program: 剑指offer
 * @description: 判断是否有子树
 * @author: tyq
 * @create: 2019-11-01 16:05
 **/
public class HasSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null||root1==null){
            return false;
        }
        return JudgeSubTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);

    }
    public boolean JudgeSubTree(TreeNode a,TreeNode b){
        if(a==null&&b!=null){
            return false;
        }
        if(b==null){
            return true;
        }
        if(a.val==b.val){
            return JudgeSubTree(a.left,b.left)&&JudgeSubTree(a.right,b.right);
        }else {
            return false;
        }
    }
}
