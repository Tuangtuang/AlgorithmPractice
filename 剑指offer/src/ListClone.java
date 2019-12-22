/**
 * @program: 剑指offer
 * @description: 复杂链表的复制
 * @author: tyq
 * @create: 2019-12-03 16:24
 **/
public class ListClone {

    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode head=new RandomListNode(pHead.label);
        pHead=pHead.next;
        RandomListNode p=head;
        RandomListNode q=pHead.next;
        while(q!=null){
            p.next=new RandomListNode(q.label);
            p.next.random=q.random;
            p=p.next;
            q=q.next;
        }
        return head;
    }
}
