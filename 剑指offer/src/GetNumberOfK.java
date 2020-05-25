/**
 * @program: 剑指offer
 * @description: 数字在排序数组中出现的次数
 * @author: tyq
 * @create: 2020-05-23 16:24
 **/
public class GetNumberOfK {

    public int GetNumberOfK(int[] array, int k) {
        if(array.length==0){
            return 0;
        }
        int index=BinarySearch(array,k);
        if(index==-1){
            return 0;
        }
        int left=index-1;
        int count=1;
        while(left>=0&&array[left]==k){
            count++;
            left--;
        }
        int right=index+1;
        while(right<array.length&&array[right]==k){
            count++;
            right++;
        }
        return count;
    }

    public int BinarySearch(int[] array, int k) {
        int low = 0, high = array.length-1;
        while (low <= high&&low<array.length&&high>=0) {
            int mid = (low + high) / 2;
            if(k<array[mid]){
                high=mid-1;
            }else if(k>array[mid]){
                low=mid+1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
