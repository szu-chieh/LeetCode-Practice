class Solution {
    public String predictPartyVictory(String senate) {
        
        // 分成兩個queue去儲存各自隊伍的權力執行順序
        // 以queue的數量作為勝利隊伍的預設(假設r隊1人，d隊0人，則r隊獲勝)
        // 接著在其中一隊清空之前，將兩個queue最左邊的pop出來進行比較，較小的重新推回queue(因為先執行的可以淘汰後面的)

        // 實際步驟：
        // - for-loop將兩個queue分好
        // - while-loop進行兩個queue最左邊執行順序的比較
        // - 推回時須加上一個offset(這邊用投票人數)來確保重新放入queue之後的順序為當前執行順序的最後一位

        Queue<Integer> rQueue = new LinkedList<Integer>();
        Queue<Integer> dQueue = new LinkedList<Integer>();

        for (int i = 0; i < senate.length(); i++) {
            char curr = senate.charAt(i);
            if (curr == 'R') rQueue.offer(i);
            else dQueue.offer(i);
        }

        String result = (rQueue.size() > dQueue.size()) ? "Radiant" : "Dire";

        while (rQueue.size() > 0 && dQueue.size() > 0) {
            int rLeft = rQueue.poll();
            int dLeft = dQueue.poll();

            if (rLeft < dLeft) {
                rQueue.offer(rLeft + senate.length());
            } else {
                dQueue.offer(dLeft + senate.length());
            }

            result = (rQueue.size() > dQueue.size()) ? "Radiant" : "Dire";
        }

        return result;
        
    }
}