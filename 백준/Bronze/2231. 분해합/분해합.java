import java.io.*;

class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N  = Integer.parseInt(br.readLine());  //입력 받을 N
    int M;                     //최소 분해합 
    int a=0;

    for(int i= 1; i<N;i++){
      M=i;                   //M 에 1부터 N 보다 작을 때 까지 자연수 넣어줌 
      int sum = 0;
      for(int j = 0; j<6; j++){     //최대 6자리 수 이므로 각 자리숫자의 합을 sum에 넣어줌
        sum += M %10;            //1의 자리를 구하는 식
        M = M/10;              //1의 자리윗 자리만 구하는 식
      }
      M=i;                    //123이면 3 을 구하고 12로 바뀐 M 을 다시 i 로 초기화
      if( sum + M == N){            // 각 자리의 합(sum) + M(최소 분해합) 이 입력한 N 과 같을 때 
        a =M;
        break;
      }
    }
  
    System.out.println(a);
    
  }
}