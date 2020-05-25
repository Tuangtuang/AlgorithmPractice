import java.util.*;

/**
 * @program: 剑指offer
 * @description: 丑数
 * @author: tyq
 * @create: 2020-05-21 18:35
 **/
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index<=6){
            return index;
        }
        int[] basicUgly = new int[]{2, 3, 5};
        Set<Integer> uglyNumber = new HashSet<>();
        uglyNumber.add(1);
        LinkedList<Integer> previousQueue = new LinkedList<>();
        previousQueue.add(1);
        for(;previousQueue.size()>0;){
            for(int j=0;j<basicUgly.length;j++){
                int tmp = previousQueue.getFirst() * basicUgly[j];
                previousQueue.add(tmp);
                uglyNumber.add(tmp);
            }
            previousQueue.removeFirst();
            if(uglyNumber.size()>index){
                break;
            }

        }
        List<Integer> uglyList = new ArrayList<>(uglyNumber);
        Collections.sort(uglyList);
        return uglyList.get(index-1);
    }
}
