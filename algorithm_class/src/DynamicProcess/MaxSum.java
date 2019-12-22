package DynamicProcess;

/**
 * @program: algorithm_class
 * @description: 最大子段和
 * @author: tyq
 * @create: 2019-11-02 20:25
 **/
public class MaxSum {

    public int getMaxSum(int []array){
        int sum=array[0];
        int b=array[0];
        for(int i=1;i<array.length;i++){
            if(b<=0){
                b=array[i];
            }else {
                b+=array[i];
            }
            if(b>sum){
                sum=b;
            }
        }
        return sum;
    }
}
