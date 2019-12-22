/**
 * @program: 剑指offer
 * @description: 青蛙跳台阶
 * @author: tyq
 * @create: 2019-10-31 20:17
 **/
public class JumpFrog {
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int a=1,b=2,c=0;
        for(int i=3;i<=target;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public int JumpFloorII(int target) {
        int []result=new int[target+1];
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        result[0]=0;
        result[1]=1;
        result[2]=2;
        for(int i=3;i<=target;i++){
            result[i]=sumArray(result,i)+1;
        }
        return result[target];
    }

    public int sumArray(int []array,int index){
        int sum=0;
        for(int i=0;i<index;i++){
            sum+=array[i];
        }
        return sum;
    }
}
