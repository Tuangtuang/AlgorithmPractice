/**
 * @program: 剑指offer
 * @description: 合并两个有序列表
 * @author: tyq
 * @create: 2019-11-01 15:43
 **/
public class ListMerge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode p=list1;
        ListNode q=list2;
        ListNode result=null;
        if(p.val<q.val){
            result=list1;
            p=p.next;
        }else {
            result=list2;
            q=q.next;
        }
        ListNode curr=result;
        while(p!=null&&q!=null){
            if(p.val<q.val){
                curr.next=p;
                curr=curr.next;
                p=p.next;
            }else {
                curr.next=q;
                curr=curr.next;
                q=q.next;
            }
        }
        if(p!=null){
            curr.next=p;
        }
        if(q!=null){
            curr.next=q;
        }
        return result;
    }
}
