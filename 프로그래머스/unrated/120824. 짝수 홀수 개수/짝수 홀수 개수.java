class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int zzack=0;
        int hoal =0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0 ){
                zzack++;
            }
            else{
                hoal++;
            }
        }
        answer[0] = zzack;
        answer[1] = hoal;
        
        return answer;
    }
}