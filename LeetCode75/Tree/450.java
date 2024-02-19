/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private TreeNode getMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public TreeNode deleteNode(TreeNode root, int key) {

        // 需要判斷的情況如下：
        //      - 空樹：直接回傳null
        //      - 找到符合key值的節點時，判斷其子節點狀態：
        //          - 只有一個子節點 / 無子節點：當只有左子節點時，刪除後由左子節點代替，反之亦然
        //          - 具有兩個子節點：則須找出右子樹中的最小值來替代這個要被刪除的值
        //            (下面的作法是找到最小節點時，把原本root的左右子樹接上去，然後替代調原本的root)
        //      - 若key值大於root的值，則以同樣的方式往右子樹找可刪除的值
        //      - 若key值小於root的值，則以同樣的方式往左子樹找可刪除的值

        if (root == null) return null;
        else if (root.val == key) {
            if (root.left == null || root.right == null) {
               root = (root.left == null) ? root.right : root.left;   
               return root;
            }

            TreeNode minNode = getMin(root.right);
            root.right = deleteNode(root.right, minNode.val);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;
        }
        else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }


        return root;
    }
}