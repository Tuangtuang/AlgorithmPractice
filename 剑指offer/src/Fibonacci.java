/**
 * @program: 剑指offer
 * @description: 斐波那契
 * @author: tyq
 * @create: 2019-10-31 19:25
 **/
public class Fibonacci {
    public int fibonacci(int n) {
        if(n==1||n==2){
            return 1;
        }
        int a=1;
        int b=1;
        int c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }


}
