import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args)throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int mom[] = new int[N];
      int key[] = new int[N];
      int rank[] = new int[N];

    for(int i =0;i<N; i++){
       StringTokenizer st = new StringTokenizer(br.readLine()," "); //""기준으로 문자열 구분
          mom[i] = Integer.parseInt(st.nextToken()); //몸무게 입력받기
          key[i] = Integer.parseInt(st.nextToken()); //키 입력받기
    }
    for(int i =0; i < N ; i++){
      int cnt = 1;
      for(int j =0; j < N ; j++){
        if(mom[i]< mom[j] && key[i] < key[j]){
          cnt += 1;
        }
      }
       rank[i] = cnt;
    }
    for (int i = 0; i < N; i++) {
      System.out.print(rank[i] + " ");
    }
  }
  
}