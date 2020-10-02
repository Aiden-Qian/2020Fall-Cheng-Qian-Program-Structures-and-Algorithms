public class Lee1019{
  public int[] nextLargerNodes(ListNode head) {
        int[] data = new int[10001];
        ListNode current = head;
        ListNode p ;
        int index = 0;
        while(current != null){
            p = current.next;
            if(p == null){
                data[index++] = 0;
            }else{
                while(p != null){
                    if(p.val > current.val){
                        data[index++] = p.val;
                        break;
                    }
                    p = p.next;
                }
                if(p == null){
                    data[index++] = 0;
                }
                
            }
            current = current.next;
        }
        int[] res = new int[index];
        for(int i = 0; i < index; ++i){
            res[i] = data[i];
        }
        return res;
    }
}
