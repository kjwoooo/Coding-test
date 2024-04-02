import java.util.*;
class Solution {
    public int solution(int[] nums) {
         int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();


        int canTake = nums.length /2; // 데려갈 수 있는 폰켓몬 마리수 저장 10 -> 5

        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        if(canTake > list.size()){ // 5 > 2
            answer = list.size();
        }else {
            answer = canTake;
        }
        return answer;
    }
}