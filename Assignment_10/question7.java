    // Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until 
//there are no such sequences.
// After doing so, return the head of the final linked list.  You may return any such answer.
// (Note that in the examples below, all sequences are serializations of ListNode objects.)
// Input: head = [1,2,-3,3,1]
// Output: [3,1]
// Note: The answer [1,2,1] would also be accepted.

import java.util.Arrays;

public class question7 {
public static ListNode removeZeroSumSublists(ListNode head) {
    ListNode node = head;

    int arr[] = new int[1000];
    int size=0;
    while(node != null){
        arr[size] = node.val;
        node = node.next;
        size++;
    }
    
    for(int i=0; i<size; i++){
        int sum = 0;
        for(int j=i; j<size; j++){
            sum += arr[j];
            if(sum == 0){
                Arrays.fill(arr, i, j+1, 0);
                i = j;
            }
        }
    }
    
    for(int i=0; i<size; i++){
        System.out.println(arr[i]);
    }
    
    head = new ListNode(0);
    ListNode tail = head;
    for(int i=0; i<size; i++){
        if(arr[i] != 0){
            node = new ListNode(arr[i]);
            tail.next = node;
            tail = node;
        }
    }
    tail.next = null;
    
    return head.next;
}
}




