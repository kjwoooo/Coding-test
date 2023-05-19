import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
 class Main { 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new               
    InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] pas = new int[N+1][N+1]; 
        
		for(int i = 0; i < pas.length; i++) 
    { 
      for(int j = 0; j <= i; j++) 
        { 
  				if(i == j || j == 0) {
            pas[i][j] = 1; 
          }
  				else 
          pas[i][j] = (pas[i-1][j-1] + pas[i-1][j]) % 10007; 
			} 
		} 
		System.out.println(pas[N][K]);
	}
}