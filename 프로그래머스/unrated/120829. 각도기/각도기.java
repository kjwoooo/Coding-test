class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (0 < angle && angle < 90 ) {
           answer = 1;
        }
        
        if (90 == angle) {
           answer = 2;
        }
        
        if (90 < angle && angle < 180 ) {
           answer = 3;
        }
         if (180 == angle) {
           answer = 4;
        }
        
            
        return answer;
    }
}