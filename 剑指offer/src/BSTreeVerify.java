/**
 * @program: 剑指offer
 * @description: 二叉搜索树的后序遍历序列
 * @author: tyq
 * @create: 2019-12-01 13:25
 **/
public class BSTreeVerify {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        return verify(sequence,0,sequence.length-1);
    }

    public boolean verify(int []seq,int start,int end){
        if(start>=end){
            return  true;
        }
        int root=seq[end];
        int i=start;
        for(;i<end;i++){
            if(seq[i]>root){
                break;
            }
        }
        for(int j=i;j<end;j++){
            if(seq[j]<root){
                return false;
            }
        }
        return verify(seq,start,i-1)&&verify(seq,i,end-1);
    }



}
