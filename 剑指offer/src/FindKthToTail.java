/**
 * @program: 剑指offer
 * @description: 链表的倒数k个结点
 * @author: tyq
 * @create: 2019-11-01 13:13
 **/
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head,int k) {
        if(k==0){
            return null;
        }
        ListNode front=head;
        ListNode end=head;
        for(int i=0;i<k-1;i++){
            if(front==null){
                return null;
            }
            if(front.next==null){
                return null;
            }else {
                front=front.next;
            }

        }
        while(front.next!=null){
            front=front.next;
            end=end.next;
        }
        return end;
    }
}
