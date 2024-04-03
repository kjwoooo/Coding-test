import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
         String answer = "";
        HashMap<String, Integer> mapByparticipant  = new HashMap<>();


        /**
        * participant(배열) = {"A", "A", "B", "C"} 일떄
        * mapByparticipant(해시맵) = {"A" = 2, "B" = 1, "C" = 1} 가 되어야함
        * */
        for (String name : participant){
            if(mapByparticipant.containsKey(name)){
                mapByparticipant.put(name, mapByparticipant.get(name) + 1); //만약 있다면 값을 +1해줌
            }else {
                mapByparticipant.put(name, 1);
            }
        }   // ----> {"A" = 2, "B" = 1, "C" = 1} 


        for (int i = 0; i < completion.length; i++) {
            String comName = completion[i];
           if( mapByparticipant.containsKey(comName) ) {
               mapByparticipant.put(comName, mapByparticipant.get(comName) - 1);
           }
        }   //  ----> ----> {"A" = 1, "B" = 0, "C" = 0} 

        for(String keyName : mapByparticipant.keySet()) {
            if(mapByparticipant.get(keyName) == 1){
                answer = keyName;
            }
        }   // 값이 1인 사람의 이름을 넘겨줌 

        return answer;
    }
}