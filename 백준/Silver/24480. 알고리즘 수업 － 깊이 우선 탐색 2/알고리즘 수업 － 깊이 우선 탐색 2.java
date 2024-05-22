
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int[] visit; // 방문 여부
    static int count =1;   // 방문 순서
    static ArrayList<ArrayList<Integer>> graph; // 인접리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]); // 정점의 개수
        int M = Integer.parseInt(input[1]); // 간선의 개수
        int R = Integer.parseInt(input[2]); // 시작 정점

         graph = new ArrayList<>();
         visit = new int[N+1];

        for (int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<>());
        }   // 인접리스트 초기화

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");

            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);  // 양방향 그래프이므로 양쪽에 모두 추가
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder()); // 각 리스트 내림차순 정렬
        }

        dfs(R);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int R) {
        visit[R] = count;

        for(int l : graph.get(R)){
            if(visit[l] == 0){
                count++;
                dfs(l);
            }
        }
    }
}