package Search;

/**
 * @program: DataStructure
 * @description: 二分查找
 * @author: tyq
 * @create: 2019-11-01 20:49
 **/
public class BinarySearch {

    public int solution(int []array,int target){
        int low=0;
        int high=array.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }
}