package Assignment_10;

public class linkListCycle {
    public class Solution
{
public ListNode detectCycle(ListNode head)
{
ListNode curr = head;
ListNode []arr =new ListNode[10000];
int ind=0;
while(curr!=null)
{
arr[ind]=curr;
curr=curr.next;
ind++;
for(int i=0;i<ind;i++)
{
if(arr[i]==curr)
{
return curr;
}
}
}
return curr;
}
}
}
