/**
 * @program: 剑指offer
 * @description: 二维数组查找
 * @author: tyq
 * @create: 2019-10-31 15:25
 **/
public class MatrixFind {
    
    /** 
    * @Description: 二维数组二分查找 
    * @Param: [target, array] 
    * @return: boolean 
    * @Author: tyq 
    * @Date: 2019-10-31 
    */ 
    public boolean FindTwoDimension(int target, int [][] array){
        int rows=array.length;
        for (int i=0;i<rows;i++){
            if(Find(target,array[i])==true){
                return true;
            }
        }
        return false;

    }

    /**
    * @Description: 二分查找
    * @Param: [target, array]
    * @return: boolean
    * @Author: tyq
    * @Date: 2019-10-31
    */
    public boolean Find(int target, int []array){
        int high=array.length;
        int low=0;
        while(low<=high&&high>=0&&low<array.length){
            int mid=(high+low)/2;
            if(target<array[mid]){
                high=mid-1;
            }else if(target>array[mid]){
                low=mid+1;
            }else {
                return true;
            }
        }
        return false;
    }
}
