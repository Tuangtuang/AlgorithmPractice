import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: 剑指offer
 * @description: 最小的K个数
 * @author: tyq
 * @create: 2020-05-20 18:35
 **/
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if(input.length<k||k==0){
            return resultList;
        }
//        Arrays.sort(input);
//        for(int i=0;i<k;i++){
//            resultList.add(input[i]);
//        }
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, comparator);

        for(int i=0;i<k;i++){
           maxHeap.add(input[i]);
        }
        for(int i=k;i<input.length;i++){
            if(input[i]<maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(input[i]);
            }
        }
        while(maxHeap.peek()!=null){
            resultList.add(maxHeap.peek());
            maxHeap.poll();
        }
        return resultList;
    }
}
