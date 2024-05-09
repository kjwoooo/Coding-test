
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 2차원 배열의 크기
        int m = Integer.parseInt(st.nextToken());   // 구간의 갯수

        int[][] numbers = new int[n+1][n+1];    // n의 크기+1 만큼 2차원 배열 생성

        // 누적합 만큼 배열에 set
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine()); // 각각의 X축 마다 새로 입력받음
            for (int j = 1; j <= n; j++) {
                numbers[i][j] = numbers[i][j-1] + Integer.parseInt(st.nextToken()); // 누적합 set
            }
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()); // 구간 입력
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum =0;
            for (int j = x1; j <= x2; j++) {
                sum += numbers[j][y2] - numbers[j][y1-1]; // 각각의 x축값을 기준으로(i) 누적합의 구간을 구함  
            }   
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}