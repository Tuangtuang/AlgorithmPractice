/**
 * @program: 剑指offer
 * @description: 重构二叉树
 * @author: tyq
 * @create: 2019-10-31 17:57
 **/
public class ReconstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length!=in.length||pre.length<1){
            return null;
        }
        if(pre.length==1){
            TreeNode node=new TreeNode(pre[0]);
            return node;
        }

        boolean flag=false;
        int index=0;
//        在中序遍利中找到根结点
        for(int i=0;i<in.length;i++){
            if(in[i]==pre[0]){
                index=i;
                flag=true;
            }
        }
//        没有在中序序列中找到，数据不对
        if(flag==false){
            return null;
        }
//        找到了，划分做子树和右子树
        TreeNode root=new TreeNode(pre[0]);
        root.left=reConstructBinaryTree(cutArray(pre,1,index+1),cutArray(in,0,index));
        root.right=reConstructBinaryTree(cutArray(pre,index+1,pre.length),cutArray(in,index+1,in.length));
        return root;

    }

    /**
    * @Description: 划分数组，左边闭区间，右边开区间
    * @Param: [array, left, right]
    * @return: int[]
    * @Author: tyq
    * @Date: 2019-10-31
    */
    public int [] cutArray(int [] array,int left, int right){
        if(left>right){
            return null;
        }
        if(left>array.length||right>array.length||left<0||right<0){
            return null;
        }
        int []result=new int[right-left];
        int k=0;
        for(int i=left;i<right;i++,k++){
            result[k]=array[i];
        }
        return result;
    }

}
