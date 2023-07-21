package Assignment_10;

public class removeNnodeFromLinkedList {
    
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head,fast = head;
        for(int i =0;i<n;i++){
            fast = fast.next;
        }
//agar mera fast ka value null hojata hai toh hum hum head ke element of delete kar dete hai.....
        if(fast==null){return head.next;}
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
}
