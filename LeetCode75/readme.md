### Linked List 
(Easy) [206. Reverse Linked List](./Linked%20List/206_Reverse_Linked_List.java)  
(Medium) [2095. Delete the Middle Node of a Linked List](./Linked%20List/2095.java)  
### Stack
(Medium) [2390. Removing Stars From a String](https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75) / [*solution*](./Stack/2390.java)  
    題目簡述：碰到“*” 移除本身以及左側鄰近的第一個字元   
(Medium) [735. Asteroid Collision](https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75) / [*solution*](./Stack/735.java)  
    題目簡述：  
    *   給予一個陣列，其中每個元素的絕對值代表asteroid的尺寸，正負號則代表其移動的方向  
    *   當兩個asteroid相碰時，尺寸小的爆炸，若相等則兩個一起爆炸  
    *   並且兩個同方向的asteroid永遠不會接觸到彼此  
### Queue
(Easy) [2390. Removing Stars From a String](https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75) / [*solution*](./Queue/2390.java)   
    題目簡述：  
    *   使用.ping(t)於時間t時進行一次請求，並回傳近3000ms的請求數量  
(Medium) [649. Dota2 Senate](https://leetcode.com/problems/dota2-senate/?envType=study-plan-v2&envId=leetcode-75) 
/ [*solution*](./Queue/649.java)   
    題目簡述：  
    *   有n個人(來自Dota的兩個隊伍)以round-robin的方式進行投票  
    *   每個senator可以選擇下列其中一種權力：  
        *   Ban one senator's right: 讓另一個隊伍的senator失去接下來的所有投票權  
        *   Announce the victory: 若senator發現剩下還能夠投票的senators都來自同一個隊伍，則可以宣告該隊伍勝利  
    *   "R"表示隊伍Radient，"D"表示隊伍Dire  
    *   假設隊伍成員皆不會跳票，並且一定會行使自身權力，輸出最終勝利的隊伍名稱
### Binary Tree
(Easy) [700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/description/?envType=study-plan-v2&envId=leetcode-75) / [*solution*](./Tree/700.java)  
    題目簡述：  
    *   給予一個root和一個整數val，找出樹中值等於val的節點，並返回以該節點為root的子樹  
    *   note: 根據TreeNode的定義，只需回傳root即可得到整個子樹  
(Medium) [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/description/?envType=study-plan-v2&envId=leetcode-75) / [*solution*](./Tree/450.java)  
    題目簡述：  
    *   找到樹中的key值並刪除   
