/**
 * @program: 剑指offer
 * @description: 旋转数组的最小数字
 * @author: tyq
 * @create: 2019-10-31 19:14
 **/

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        int result=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                result=array[i+1];
                break;
            }
        }
        return result;
    }
}
