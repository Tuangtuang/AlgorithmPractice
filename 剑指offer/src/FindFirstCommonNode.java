import java.util.HashSet;
import java.util.Set;

/**
 * @program: 剑指offer
 * @description: 两个链表的第一个公共结点
 * @author: tyq
 * @create: 2020-05-23 15:56
 **/
public class FindFirstCommonNode {
//    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//        if(pHead1==null||pHead2==null){
//            return null;
//        }
//        Set<ListNode> list2Address = new HashSet<>();
//        ListNode p=pHead2;
//        while (p!=null){
//            list2Address.add(p);
//            p=p.next;
//        }
//        p=pHead1;
//        while (p!=null){
//            if (list2Address.contains(p)) {
//                return p;
//            }
//            p=p.next;
//        }
//        return null;
//    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode p1=pHead1,p2=pHead2;
        while(p1!=p2){
            p1=(p1==null)?pHead2:p1.next;
            p2=(p2==null)?pHead1:p2.next;
        }
        return p1;
    }


}
