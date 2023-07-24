import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    Stack<Character> stack = new Stack<Character>(); //스택 생성
    int cnt = 0; //카운트 해 줄 변수 생성

    for(int i=0; i<N; i++){
      String ABAB = br.readLine(); //입력 받을 문자열
      
      for(int j=0; j<ABAB.length();j++){ 
          //만약 스택이 비어있거나 , j번째 문자가 현재 스택의 최상단과 같다면 pop 시켜 꺼낸다. 
        if( !stack.isEmpty()&& ABAB.charAt(j) == stack.peek()){
          stack.pop();
        }
        else
          stack.push(ABAB.charAt(j)); //아니라면 그 값을 넣는다
        } 
      
        if(stack.isEmpty()){ //for문을 다 돈후 그 스택의 값이 비어있다면 좋은 수 이므로 카운트 시킨다
          cnt++;
        }
        stack.clear();//홀수갯수의 입력 시, 짝지어지지 않았을 경우 스택의 데이터를 비워줌
    }
		System.out.println(cnt);

  }
}
