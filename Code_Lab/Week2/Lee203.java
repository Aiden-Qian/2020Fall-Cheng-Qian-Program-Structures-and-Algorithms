public class Lee203{
  public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode current = head;
        ListNode pre = null;
        while(current.next != null){
            if (current.val == val){
                if (current == head){
                    head = head.next;
                    current = head;
                }else{
                    ListNode next = current.next;
                    pre.next = next;
                    current = next;
                }
            }else{
                pre = current;
                current = current.next;
            }
        }
        if (current.val == val){
            if (pre == null) return null;
            else pre.next = null;
        }
        return head;
    }

}
