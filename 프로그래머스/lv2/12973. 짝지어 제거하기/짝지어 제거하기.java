import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0; i<s.length(); i++ ){
         if(st.isEmpty()){
             st.push(s.charAt(i)); //비어있으면 현재값 넣음
         }
            else{
                if(st.peek() == s.charAt(i)){ //현재 값과 스택의 값이 같으면 pop();
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.isEmpty()){
            return 1;
        }
        else
            return 0;
        

        
    }
}