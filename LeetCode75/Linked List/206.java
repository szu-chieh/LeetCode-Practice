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

class Solution {
    public ListNode reverseList(ListNode head) {

        // 實際步驟：
        // - 紀錄當前(curr)以及前一個(previousNode)節點
        // - 使用nextNode保存下一個要處理的節點
        // - 將curr的下一個節點指向原本的previousNode
        // - 處理完成之後curr變成下一個要處理的節點的previousNode
        // - 要處理的curr變成前面已經紀錄的nextNode
        // - loop直到最後一個節點處理完(curr == null)
        // - 最終return的previousNode即是reverseList的起點

        ListNode curr = head;
        ListNode previousNode = null;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = previousNode;
            previousNode = curr;
            curr = nextNode;
        }

        return previousNode;
    }
}