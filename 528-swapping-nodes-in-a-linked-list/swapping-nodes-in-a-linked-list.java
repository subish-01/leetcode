/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode swapNodes(ListNode head, int k) 
    {
        if(head.next == null)
        {
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int left = k - 1;
        int right = list.size() - k;
        int temp = list.get(left);
        list.set(left,list.get(right));
        list.set(right,temp);
        int index = 0;
        while(curr != null)
        {
            curr.val = list.get(index++);
            curr = curr.next;
        }
        return head;
    }
}