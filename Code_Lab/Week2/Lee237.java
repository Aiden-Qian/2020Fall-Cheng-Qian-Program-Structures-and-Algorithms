public class Lee237{
  public void deleteNode(ListNode node) {
		ListNode next=node.next;
		node.val=next.val;
		node.next=next.next;       				
		return;
    }
}
