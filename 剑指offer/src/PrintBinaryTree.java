import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @program: 剑指offer
 * @description: 从下往上打印二叉树
 * @author: tyq
 * @create: 2019-11-01 18:55
 **/
public class PrintBinaryTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }else {

            LinkedList<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            while(queue.size()!=0){
                TreeNode temp=queue.getFirst();
                result.add(temp.val);
                queue.removeFirst();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            return result;
        }

    }
}
