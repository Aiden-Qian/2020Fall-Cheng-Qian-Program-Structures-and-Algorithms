public class Lee82{
  public ListNode deleteDuplicates(ListNode head) {
        ListNode st = new ListNode(0);
        if(head == null || head.next == null)
        	return head;
        
        st.next = head;
        ListNode p = head, q = head.next, k = st;
        boolean flag = false;
        while(q != null){
        	flag = false;
        	while(q != null && q.val == p.val){   
        		flag = true;
        		q = q.next;
        	}
        	if(flag == true){
        		k.next = q;
        		if(q == null) return st.next; 
        		p = k.next;
        		q = p.next;
        	}
        	else{
        		p = p.next;
        		q = q.next;
        		k = k.next;
        	}
        	
        }
        return st.next; 
    }
}
