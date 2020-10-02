public class Lee143{
  public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return ;
        ListNode head2 = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
        	slow = slow.next;
        	fast = fast.next.next;
        	if(slow == fast){
        		break;
        	}
        }
        head2 = reverseList(slow.next);
        slow.next = null;
        while(head!=null && head2!=null){
        	ListNode p1 = head.next;
        	ListNode p2 = head2.next;
        	head.next = head2;
        	head2.next = p1;
        	head = p1;
        	head2 = p2;
        }
    }
     public static ListNode reverseList(ListNode head){
    	ListNode cur = null;
    	ListNode p = head.next;
    	if(p == null) return head;
    	cur = head;
    	cur.next = null;
    	while(p!=null){
    		ListNode tmp = cur;
    		cur = p;
    		p = p.next;
    		cur.next = tmp;
    	}
    	return cur;
    }

}
