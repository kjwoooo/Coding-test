import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    System.out.println(pivo(T));
  }
  static int pivo(int N){
    if(N==0) 
      return 0;
    else if(N == 1)
      return 1;

    return pivo(N-1) +pivo(N -2);
    
  }
  
}