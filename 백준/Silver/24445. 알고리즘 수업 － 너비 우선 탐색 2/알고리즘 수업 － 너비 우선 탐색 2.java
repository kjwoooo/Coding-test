
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] visited;
    static int count =1;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        visited = new int[N+1];
        graph = new ArrayList<>();

        for (int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<>());
        }   // 인접리스트 초기화

        for (int i = 0; i < M; i++) {
            input =  br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);

            graph.get(u).add(v);
            graph.get(v).add(u);    // 양방향 관계 지정
        }
        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        } // 각 인접리스트 내림차순 정렬

        bfs(R);

        StringBuilder  sb = new StringBuilder();

        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);

    }

    public static void bfs(int r) {
        visited[r] = count; // 시작 지점에 count값(1) 초기화
        Queue<Integer> q = new LinkedList<>();  // 큐 생성
        q.offer(r);

        while(!q.isEmpty()){
            int num = q.poll();
            for (int i = 0; i < graph.get(num).size(); i++) {
                int newNum = graph.get(num).get(i);
                if (visited[newNum] == 0) {
                    count++;
                    visited[newNum] = count;
                    q.offer(newNum);
                }
            }
        }
    }
}