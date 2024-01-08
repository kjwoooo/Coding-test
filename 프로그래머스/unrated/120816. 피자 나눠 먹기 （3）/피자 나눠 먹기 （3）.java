class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n%slice == 0){
            answer = n / slice;
        }
        else{ 
            answer = n / slice + 1;
        }
        
        return answer;
    }
}

// 2각 ~ 10조각 원하는 조각으로 잘라줌 --> slice
// n 명의 사람이 최소한 한조각 이상으로 먹어야함  --> n
