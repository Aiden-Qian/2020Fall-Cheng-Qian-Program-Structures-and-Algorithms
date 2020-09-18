public class Main {

        public static class ListNode {
            int val;
            ListNode next;
            ListNode(int x,ListNode y) { val = x; next=y;}
        }

        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode first = new ListNode(0,null);
            first.next = head;
            ListNode p1 = first;
            ListNode p2 = first;
            int k = 0;
            while(k<n)
            {
                if(p2.next == null)
                    return head;
                p2 = p2.next;
                k++;
            }
            while(true)
            {
                if(p2.next == null)
                {
                    p1.next = p1.next.next;
                    break;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            return first.next;
        }

        public static ListNode removeDuplicates(ListNode head)
        {
            if(head==null)
            {
                return null;
            }
            ListNode cur = head;
            while (cur.next!=null)
            {
                if(cur.val==cur.next.val)
                {
                    cur.next=cur.next.next;
                }
                else {
                    cur = cur.next;
                }
            }
            return head;
        }

        public static ListNode partitionList(ListNode head, int x) {
            ListNode list1=new ListNode(0,null);
            ListNode list2=new ListNode(0,null);
            ListNode p1=list1;
            ListNode p2=list2;

            ListNode start=head;
            while(start!=null){
                int value=start.val;
                if(value<x){
                    p1.next = start;
                    p1=p1.next;
                    // list1.next=null;
                }else{
                    p2.next = start;
                    p2=p2.next;
                }
                start=start.next;
            }
            p2.next=null;

            p1.next=list2.next;

            return list1.next;
        }

        public static ListNode insertCircular(ListNode head, int insertVal){
            if(head == null){
                head = new ListNode(insertVal, null);
                head.next = head;
                return head;
            }
            ListNode cur = head;
            while(true){
                if(cur.val < cur.next.val){
                    if(cur.val<=insertVal && insertVal<=cur.next.val){
                        cur.next = new ListNode(insertVal, cur.next);
                        break;
                    }
                }
                else if(cur.val > cur.next.val){
                    if(cur.val<=insertVal || insertVal<=cur.next.val){
                        cur.next = new ListNode(insertVal, cur.next);
                        break;
                    }
                }
                else{
                    if(cur.next == head){
                        cur.next = new ListNode(insertVal, head);
                        break;
                    }
                }
                cur = cur.next;
            }
            return head;
        }

        public static int getDecimalValue(ListNode head) {

            if (head == null)
                return 0;
            int ans = 0;
            while (head != null) {
                ans = (ans << 1) + head.val;
                head = head.next;
            }
            return ans;

        }



        public static void main(String[] args) {
            ListNode thirdNode_L=new ListNode(3,null);
            ListNode secondNode_L = new ListNode(2,thirdNode_L);
            ListNode firstNode_L = new ListNode(1,secondNode_L);
            ListNode head_L = new ListNode(0,firstNode_L);

            ListNode L= removeNthFromEnd(head_L,2);
            while(L != null) {
                System.out.print(L.val + " ");
                L = L.next;
            }
            System.out.println();

            ListNode thirdNode_D=new ListNode(3,null);
            ListNode secondNode_D = new ListNode(1,thirdNode_D);
            ListNode firstNode_D = new ListNode(1,secondNode_D);
            ListNode head_D = new ListNode(0,firstNode_D);

            ListNode D=removeDuplicates(head_D);
            while(D != null) {
                System.out.print(D.val + " ");
                D = D.next;
            }
            System.out.println();

            ListNode fourthNode_P=new ListNode(5,null);
            ListNode thirdNode_P=new ListNode(2,fourthNode_P);
            ListNode secondNode_P = new ListNode(3,thirdNode_P);
            ListNode firstNode_P = new ListNode(4,secondNode_P);
            ListNode head_P = new ListNode(1,firstNode_P);

            ListNode P=partitionList(head_P,3);
            while(P != null) {
                System.out.print(P.val + " ");
                P = P.next;
            }
            System.out.println();

            ListNode secondNode_C = new ListNode(1,null);
            ListNode firstNode_C = new ListNode(4,secondNode_C);
            ListNode head_C = new ListNode(3,firstNode_C);
            secondNode_C.next=head_C;

            ListNode C=insertCircular(head_C,2);

            int n=0;
            while(n!=4) {
                System.out.print(C.val + " ");
                C = C.next;
                n++;
            }
            System.out.println();

            ListNode secondNode_G = new ListNode(1,null);
            ListNode firstNode_G = new ListNode(0,secondNode_G);
            ListNode head_G = new ListNode(1,firstNode_G);
            Integer k=getDecimalValue(head_G);
            System.out.println(k);


        }
    }


