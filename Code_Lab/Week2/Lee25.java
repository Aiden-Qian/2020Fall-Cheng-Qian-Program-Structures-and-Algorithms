public class Lee25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head ==null || head.next ==null)
            return head;
        int count =0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            count++;
            if(count==k){
                pre = reverse(pre,next);
                count=0;
            }
            cur = next;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode pre,ListNode end){
        if(pre == null||pre.next ==null)
            return pre;
        ListNode head = pre.next;
        ListNode cur = pre.next.next;
        while(cur!=end){
            ListNode next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        head.next=end;//end其实是下一个要反转的头结点
        return head;
    }
}
