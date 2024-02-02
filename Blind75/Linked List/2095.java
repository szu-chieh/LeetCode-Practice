/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode deleteMiddle(ListNode head) {

        // - 創建一個虛擬原點指向原本的head
        // - 使用快指標和慢指標，其中快指標以慢指標的兩倍速度走訪linked list
        // - 則當快指標走到末端停下時，slow的下一個節點就是要刪除的middle node
        // - slow的next指向下下一個節點即為刪除

        //  dummy | head | node2 | node3 | ...
        //   ⭡⭡
        //   sf

        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }
}