import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
  
  static int n; //노드의 개수
	static int[] parents; //출력할 부모노드 배열
	static boolean[] visited; // 방문했는지 확인 
	static ArrayList<Integer>[] list; //라스트로 이루어진 배열
  
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());

    //0번 인덱스를 버리고 1번 부터 사용하기 위함
		parents = new int[n+1];
		visited = new boolean[n+1];
		list = new ArrayList[n+1];

    //ArrayList의 배열을 만들기 위해 초기화 해줌
		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			list[X].add(Y);
			list[Y].add(X);
		}// 값 입력 받음 --> 배열의 (리스트로된) 각 인덱스에 값을 넣어줌 ex) 1 6  6 1 
    //1번 인덱스(리스트)에 6을 넣어주고 6번 리스트에 1을 넣어줌으로써 맥락상으로 연관 되게 만들어줌
		
		
		for (int i = 1; i <= n; i++) {
      if(!visited[i]){
		  	dfs(i);
		} //
	}//end 

  for(int i =2 ; i<=n; i++){
  System.out.println(parents[i]);
  }
  }
  private static void dfs(int x){
    if(visited[x]) {
      return;
    }
    
    visited[x] =true;

    for(int i : list[x]) {
      if(!visited[i]) {
        parents[i] = x;
        dfs(i);
      }
    }
  }
}
