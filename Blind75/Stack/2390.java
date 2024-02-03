class Solution {
    public String removeStars(String s) {

        // 被stack的分類騙，卡在硬要使用stack物件導致最後沒辦法轉成整串的string
        // 實際上需要的只是stack的概念
        
        // 實際步驟：
        // - 碰到非*的字元：直接放入buffer的最後（基本上就是push）
        // - 碰到*字元：將buffer最後的字元刪除（pop）


        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                result.append(s.charAt(i));
            }
            else {
                result.deleteCharAt(result.length() - 1);
            }
        }   

        return result.toString();
    }
}