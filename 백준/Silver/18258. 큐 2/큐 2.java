import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
  public static void main(String[] args) throws IOException /* IOEXception이 발생할수있다고 예외처리 해주어야 한단다 */ {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");// bufferedReader를 통해 입력 받는 값을 ""(공백)을 기준으로 나눈다
    int n = Integer.parseInt(st.nextToken()); // 입력받은 값을 int 형으로 변환시킨다

    Deque<Integer> deque = new ArrayDeque<>(); // 덱 선언
    for (int i = 0; i < n; i++) {
        /*nextToken() 함수를 호출할 때마다 다음의 토큰이 반환됨 */
      st = new StringTokenizer(br.readLine(), " "); // for문이 돌아갈 떄 마다 새로운 토크나이져 객체를 생성해주어야함
      switch (st.nextToken()) { // 다음으로 입력된 값을 switch case 문 사용
        case "push":
          int num = Integer.parseInt(st.nextToken()); // 그 다음으로 입력된 문자열을 int 형으로 반환
          deque.add(num); // 큐에 num 값을
          break;
        case "pop":
          if (deque.isEmpty()) {
            sb.append("-1\n");
          } else {
            sb.append(deque.poll() + "\n"); // 스택에서 pop 과 같은 제일 앞의 원소를 반환후 삭제하는 함수(poll()) 를 만들어놓은 StrinfBuilder 의 객체
                                            // sb에 추가
          }
          break;
        case "size":
          sb.append(deque.size() + "\n");
          break;
        case "empty":
          if (deque.isEmpty()) {
            sb.append("1\n");
          } else {
            sb.append("0\n");
          }
          break;
        case "front":
          if (deque.isEmpty()) {
            sb.append("-1\n");
          } else {
            sb.append(deque.getFirst() + "\n");
          }
          break;
        case "back":
          if (deque.isEmpty()) {
            sb.append("-1\n");
          } else {
            sb.append(deque.getLast() + "\n");
          }
          break;

      }
    }
    System.out.println(sb);
  }
}