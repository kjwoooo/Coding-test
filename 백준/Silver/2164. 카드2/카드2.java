import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args)throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    Queue<Integer> qu = new LinkedList<Integer>();

    for(int i=1; i<=N; i++){
      qu.add(i);
    }
    while(qu.size()> 1){
      qu.poll(); //맨 앞의 값 반환후 삭제
      qu.offer(qu.poll());
    }
    System.out.println(qu.peek());
    
  }
}