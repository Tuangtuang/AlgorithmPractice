import DynamicProcess.LCSlength;
import DynamicProcess.MaxSum;
import Recursion.Perm;

public class Main {

    public static void main(String[] args) {
//        testPerm();
//        testLCSlength();
        testMaxSum();
    }

    public static void testPerm(){
        int []arr={1,2,3};
        Perm perm=new Perm();
        perm.solution(arr,0,3);
    }


    public static void testLCSlength(){
        String a=new String("abcbdab");
        String b=new String("bdcaba");
        LCSlength lcSlength=new LCSlength();
        int [][]record=new int[a.length()+1][b.length()+1];
        int res=lcSlength.getLCSlength(a,b,record);
        System.out.println("result="+res);
    }


    public static void testMaxSum(){
        int [] array={-1,-2};
        MaxSum maxSum=new MaxSum();
        int res=maxSum.getMaxSum(array);
        System.out.println("result="+res);
    }

}
