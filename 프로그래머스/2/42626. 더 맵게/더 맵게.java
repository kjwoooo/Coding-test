import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> prQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            prQueue.offer(scoville[i]);
        }
        int count = 0;

        while (prQueue.peek() < K) { // k = 7
            if (prQueue.size() == 1) { // 스코빌 지수를 K 이상으로 만들 수 없는 경우
                return -1;
            }
            Integer firstScoville = prQueue.poll();
            Integer secondScoville = prQueue.poll();
            Integer mixScoville = firstScoville + (secondScoville * 2);
            prQueue.offer(mixScoville);
            answer++;
        }

        return answer;
    }
}