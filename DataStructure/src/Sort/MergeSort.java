package Sort;

/**
 * @program: DataStructure
 * @description: 合并排序
 * @author: tyq
 * @create: 2019-11-01 20:56
 **/
public class MergeSort {
    public void solution(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        solution(arr,start,mid);
        solution(arr,mid+1,end);
        int []result=merge(arr,0,mid,end);
        System.arraycopy(result,0,arr,0,result.length);
    }

//    合并两个排序好的数组
    public int[] merge(int []target,int left,int mid,int right){
        int []result=new int[right-left];
        int k=0,i=0,j=mid;
        for(;i<mid&&j<right;){
            if(target[i]<=target[j]){
                result[k]=target[i];
                i++;
            }else {
                result[k]=target[j];
                j++;
            }
            k++;
        }
        if(i>=mid){
            while(j<right){
                result[k]=target[j];
                k++;
                j++;
            }
        }else {
            for(;i<mid;){
                result[k]=target[i];
                k++;
                i++;
            }
        }
        return result;
    }
}
