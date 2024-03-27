
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] workTime = new int[progresses.length];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        // 각 기능이 완료될 때(100)까지 걸리는 시간
        //[93, 30, 55], [1, 30, 5] --> 7 3 9
        //[95, 90, 99, 99, 80, 99],	[1, 1, 1, 1, 1, 1] --> 5 10 1 1 20 1
        for (int i = 0; i < workTime.length; i++) {
            workTime[i] =((100 - progresses[i]) /speeds[i]);
            if( (100 - progresses[i]) %speeds[i]>0 ){
                workTime[i]++;
            }
        }

        //  7 3 9 의 시간을 --> 스택에 peek값이 7이 오도록 담음
        for (int i = workTime.length -1  ;i >=0 ; i--) {
            stack.push(workTime[i]);
        }

        int recentValue =0;
        int count =0;
        

        while(!stack.isEmpty()){
            if(count == 0){     //처음시작하거나 앞의 기능들이 배포된 경우
                recentValue = stack.pop();
                count++;
            }else if(!stack.isEmpty() && recentValue >= stack.peek()){
                stack.pop();
                count++;
            }
            else {
                list.add(count);
                count =0;
            }
        }//while
        
        if (count > 0) {
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}