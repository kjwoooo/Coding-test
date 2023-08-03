import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int Max = 0;
        int Min = 0;
        for(int i = 0; i < sizes.length;i++) {
            int a = Math.max(sizes[i][0], sizes[i][1]);
            Max = Math.max(Max, a);
            
            int b = Math.min(sizes[i][0], sizes[i][1]);
            Min = Math.max(Min, b);
        }
        int answer = Max*Min;
        return answer;
    }
}