import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length]; 
        
        for(int i=0 ; i< commands.length; i++){
            int start = commands[i][0] -1;
            int end = commands[i][1];
            int num = commands[i][2]-1;
            
            int[] answer = Arrays.copyOfRange(array, start, end);
            Arrays.sort(answer);
            
             result[i] = answer[num];
        }
        
        return result;
    }
}