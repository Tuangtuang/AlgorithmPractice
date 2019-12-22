import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: 剑指offer
 * @description: 从尾到头打印链表
 * @author: tyq
 * @create: 2019-10-31 16:37
 **/
public class ReversePrintLinkedList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (listNode!=null){
            arrayList.add(listNode.val);
            listNode=listNode.next;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
