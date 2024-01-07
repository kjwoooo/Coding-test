class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        if (n % 2 == 0) {
            answer = new int[n / 2]; //짝수일 때 반
        } else {
            answer = new int[(n + 1) / 2]; //홀수일 때 반 
        }
        
        for (int i = 0; i < answer.length; i++) { //배열의 길이 만큼
                answer[i] = (i * 2) + 1;
            }
        return answer;
    }
}