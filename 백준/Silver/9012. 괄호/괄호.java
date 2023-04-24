import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String S = br.readLine();
			
			
		Stack<Character> stack = new Stack<Character>();
			
			for(int j = 0; j < S.length(); j++) {
        
		if(S.charAt(j) == '(') {
					stack.push(S.charAt(j)); //여는 괄호일때 그냥 넣음
				}else { //그게 아닐경우
					
					if(stack.empty()) { //비어있으면 받아온거 넣고
						stack.push(S.charAt(j));
						break;
					}else {//그게아니라면(')'라면 () 가 완성됬으니까 꺼낸다)
						stack.pop();
					}
				}
			}
			if(stack.empty()) //비어있으면 () 가 만들어져 꺼냇음으로 에스
        System.out.println("YES");
			else 
        System.out.println("NO");
		}
	}

}
