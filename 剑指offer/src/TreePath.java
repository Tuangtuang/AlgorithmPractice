import java.util.ArrayList;

/**
 * @program: 剑指offer
 * @description: 二叉树中和为某一值的路径
 * @author: tyq
 * @create: 2019-12-03 15:59
 **/
public class TreePath {
    ArrayList<Integer> temp=new ArrayList<>();
    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null){
            return result;
        }
        temp.add(root.val);
        target=target-root.val;
//        走到叶子结点，且满足和为target
        if(root.right==null&&root.left==null&&target==0){
            result.add(new ArrayList<>(temp));
        }
//        左右子树
        FindPath(root.left,target);
        FindPath(root.right,target);
//        回退到前面一层
        temp.remove(temp.size()-1);
        return result;

    }

}
