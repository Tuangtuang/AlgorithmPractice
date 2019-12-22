/**
 * @program: 剑指offer
 * @description: 二进制中1的个数
 * @author: tyq
 * @create: 2019-10-31 20:50
 **/
public class NumberOfOne {
    public int NumberOf1(int n) {
        int sum=0;
        int flag=1;
        while(flag!=0){
            if((n&flag)!=0){
                sum++;
            }
            flag=flag<<1;
        }
        return sum;
    }
}
