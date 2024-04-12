
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int number = Integer.parseInt(br.readLine());

        for(int i=0; i<number; i++) {
            int X = Integer.parseInt(br.readLine());

            if(X == 0) { // 입력 받는 값이 0 이라면
                if(queue.isEmpty()) {
                    System.out.println("0"); //비어있다면 0을 반환한다는 조건
                }
                else {
                    System.out.println(queue.poll()); // 최상단 값을 반환/삭제
                }
            }
            else
                queue.add(X);
        }
    }
}