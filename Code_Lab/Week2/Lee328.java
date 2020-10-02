public class Lee328 {
    public ListNode oddevenlist(ListNode head) {
        int i = 1;
        ListNode cur = null, oddHead = head, evenHead = null, oddCur = oddHead, evenCur = null;
        if(oddHead == null)
        	return head;
        else {
        	evenHead = oddHead.next;
        	evenCur = evenHead;
        }
        if(evenHead == null)
        	return head;
        cur = evenCur.next;	
        while(cur != null){
        	if(i % 2 == 1){
        		oddCur.next = cur;
        		oddCur = cur;
        		cur = cur.next;
        	} else {
        		evenCur.next = cur;
        		evenCur = cur;
        		cur = cur.next;
        	}
        	i++;
        }
        evenCur.next = null;
        oddCur.next = evenHead;
        return oddHead;
    }
