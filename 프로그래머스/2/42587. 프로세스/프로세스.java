import java.util.Collections;
import java.util.PriorityQueue;

 class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;


            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < priorities.length; i++) {
                queue.offer(priorities[i]);
            }   // 큰 숫자 기준으로 우선순위 큐에 저장

            while(!queue.isEmpty()){
                for (int i = 0; i <priorities.length ; i++) {
                    if(priorities[i] == queue.peek() ){
                        queue.poll();
                        answer++;

                        if(location == i){
                            return answer;
                        }
                    }

                }
            }
            return answer;
        }
}