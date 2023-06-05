import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int num = Integer.parseInt(br.readLine());
    int cnt = 0;
    
    if(num < 100){
      cnt = num;
      System.out.println(cnt);
    }
      
    else{
      cnt = 99;
      for(int i = 100; i<=num ; i++){
        int a = (i/100);
        int b = (i%100)/10;
        int c = i%10;
        
        if(b-a == c-b ){
          cnt++;
          
        }        
      }

      System.out.println(cnt);
    }
    
    

  }
}
      

    
    
