import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {

    static int jum; //정점
    static int gan; //간선
    static boolean[] visit; //방문했는지 확인
    static ArrayList<Integer>[] list;  //리스트로 이루어진 배열 -> 그래프 구현
    int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    

         StringTokenizer st = new StringTokenizer(br.readLine());
        jum = Integer.parseInt(st.nextToken());  // 접점 입력
        gan = Integer.parseInt(st.nextToken());  // 간선 입력 

        visit = new boolean[jum + 1];   //접점(jum) + 1 만큼 생성 (0 안쓰기 위해)
        list = new ArrayList[jum  + 1]; //0 안쓰기 위해 리스트로 된 배열 생성 


        for(int i = 1; i <=jum ; i++){   //ArrayList의 배열을 만들기 위해 초기화 해줌
             list[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i<gan; i++){        //각각의 점점을 입력받음 
            StringTokenizer ss = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(ss.nextToken());
            int num2 = Integer.parseInt(ss.nextToken());

            list[num1].add(num2);
            list[num2].add(num1);

        } 
        int cnt = 0;

        for(int i = 1; i <=jum; i++) {
            if(!visit[i]){
                dfs(i);
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }


    static void dfs(int x){
        if(visit[x]) {
            return;
        }

        visit[x] =true;

        for(int i : list[x]) {
            dfs(i);
        }
    }
}

