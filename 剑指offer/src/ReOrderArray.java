/**
 * @program: 剑指offer
 * @description: 调整数组顺序使奇数位于偶数前面
 * @author: tyq
 * @create: 2019-11-01 12:37
 **/
public class ReOrderArray {
    /** 
    * @Description: 奇数在前，偶数在后，不关注原本的顺序
    * @Param: [array] 
    * @return: void 
    * @Author: tyq 
    * @Date: 2019-11-01 
    */ 
    public void reOrderArray(int [] array,int left,int right) {
        if(left>=right){
            return;
        }
        //调用快速排序方法，将数组和指针传入
        int index = divide(array, left, right);
        //递归调用，分别对排序好的左右两小部分（左边小于原先基准数的数列 右边大于原先基准数的数列）进行重复步骤排序
        reOrderArray(array, left, index - 1);//左边
        reOrderArray(array, index + 1, right);//右边
    }

    public int divide(int []array,int left,int right){
        if(left>right){
            return 0;
        }
        int base=array[left];
        while(left!=right){
            while (array[right]%2==0&&right>left){
                right--;
            }
            array[left]=array[right];
            while (array[left]%2==1&&left<right){
                left++;
            }
            array[right]=array[left];

        }
        array[left]=base;
        return right;
    }

    public void reOrderArrayPos(int [] array) {
        int []result=new int[array.length];
        int k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                result[k]=array[i];
                k++;
            }
        }
        for(int j=0;j<array.length;j++){
            if(array[j]%2==0){
                result[k]=array[j];
                k++;
            }
        }
        System.arraycopy(result,0,array,0,result.length);


    }
}
