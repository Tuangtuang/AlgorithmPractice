/**
 * @program: 剑指offer
 * @description: 反转链表
 * @author: tyq
 * @create: 2019-11-01 13:40
 **/
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode pre=null,curr=head,next=head.next;
        while(next!=null){
            curr.next=pre;
            pre=curr;
            curr=next;
            next=next.next;
        }
        curr.next=pre;

        return curr;

    }
}
