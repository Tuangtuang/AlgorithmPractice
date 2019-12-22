package Recursion;

/**
 * @program: algorithm_class
 * @description: 排列问题
 * @author: tyq
 * @create: 2019-11-01 19:38
 **/
public class Perm {
    public void solution(int []arr,int left,int right){
        if(right==left){
//            只剩下一个元素
            for(int i=0;i<right;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("\n");
        }else {
//            剩下n个元素排列
            for(int j=left;j<right;j++){
                int temp=arr[j];
                arr[j]=arr[left];
                arr[left]=temp;
                solution(arr,left+1,right);
                temp=arr[j];
                arr[j]=arr[left];
                arr[left]=temp;
            }
        }

    }


}
