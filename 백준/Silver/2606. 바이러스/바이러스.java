import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int ComCnt, Ssang;
	static int[][] arr;
	static boolean[] visit;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		ComCnt = Integer.parseInt(br.readLine());
		Ssang = Integer.parseInt(br.readLine());
		
		arr = new int[ComCnt + 1][ComCnt + 1];
		visit = new boolean[ComCnt + 1];
		
		for(int i = 1 ; i <= Ssang; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			arr[num1][num2] = 1;
			arr[num2][num1] = 1;
		}
        dfs(1);
		System.out.println(cnt- 1);
	}
	
	static void dfs(int num) {
        visit[num] = true;
        cnt++;
        for(int i = 1 ; i <= ComCnt; i++) {
            if(arr[num][i] == 1 && !visit[i]) {	
                dfs(i);
            }
        }
	}
}