import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] miarr = br.readLine().split("-");
    int answer = 0;

    for(int i=0; i < miarr.length;i++){
      String[] plarr = miarr[i].split("\\+");

      int tmp = 0;
      for(int j=0; j<plarr.length; j++){
        tmp += Integer.parseInt(plarr[j]);
      }

        if(i==0){
          answer += tmp;
        }
        else {
          answer -= tmp;
        }
      }
     System.out.print(answer);
  }
   
}


