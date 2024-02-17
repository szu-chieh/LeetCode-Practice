
class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        // 根據asteroids每一個元素的正負值分成兩種處理情況
        // 大於0：直接push
        // 小於0：當空stack或是負值時(同方向)直接push，若為正值表示會相撞，需判斷哪個值將被保留

        // 實際步驟：
        // - a為正值直接push，負值則檢查下列情況：
        //      - 空stack或最右邊的值同方向則直接push
        //      - 利用while檢查反方向的asteroid
        //      - 小於等於的一率pop最右邊的值，但需要注意當兩個值尺寸相同時，兩個皆消失（因此直接break出去）
        //      - pop完需檢查stack是否為空，或是下一個碰到的值是否同向，是的話將當前值push至陣列中

        Stack<Integer> result = new Stack<Integer>();

        for (int a: asteroids) {
            if (a < 0) {
                if (result.isEmpty() || result.peek() < 0) {
                    result.push(a);
                }
                else {
                    while (!result.isEmpty() && result.peek() > 0) {
                        if (result.peek() + a <= 0) {
                            if (result.pop() == Math.abs(a)) 
                                break;

                            if (result.isEmpty() || result.peek() < 0)
                                result.push(a);
                        }
                        else break;
                        
                    }
                }
            }
            else {
                result.push(a);
            }
        }
        
        Object[] tmp = result.toArray();
        int[] resultArr = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            resultArr[i] = (int) tmp[i];
        }
        
        // 其他stack轉陣列的方式：
        // int ans[] = new int[result.size()];
        // for(int i = 0; i < ans.length; i++)
        //     ans[i] = result.pollLast();

        return resultArr;
    }
}