package Sort;

/**
 * @program: DataStructure
 * @description: 快速排序
 * @author: tyq
 * @create: 2019-11-01 21:41
 **/

public class QuickSort {
    public void quickSortSolution(int []arr,int left,int right){
        if(left<right){
            int index=divide(arr,left,right);
            quickSortSolution(arr,left,index-1);
            quickSortSolution(arr,index+1,right);
        }
    }

    public int divide(int []arr,int left,int right){
        int base=arr[left];
        while(left<right){
            while(arr[right]>base&&right>left){
                right--;
            }
            arr[left]=arr[right];
            while(arr[left]<base&&right>left){
                left++;
            }
            arr[right]=arr[left];

        }
        arr[left]=base;
        return left;
    }
}
