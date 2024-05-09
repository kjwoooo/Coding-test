import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineInput = br.readLine().split(" ");
        int N = Integer.parseInt(firstLineInput[0]);
        int M = Integer.parseInt(firstLineInput[1]);    // N=5  M=3 입력

        String[] inputs = br.readLine().split(" "); // 숫자들 입력 받음
        int numbers[] = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);   // 배열에 수 저장(문자(inputs) -> 정수(numbers))
        }

        int accumulateSum[] = new int[N + 1]; // 6 크기의 배열 만듬
        accumulateSum[0] = 0; // 0번째 인댁스 0추가 1 3 일떄 1-1의 인덱스를 뺼 수 있어야함 

        for (int i = 1; i <= N; i++) {
            accumulateSum[i] = accumulateSum[i - 1] + numbers[i - 1]; // 누적합 저장
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String[] select = br.readLine().split(" ");
            int start = Integer.parseInt(select[0]);
            int end = Integer.parseInt(select[1]);
            sb.append((accumulateSum[end] - accumulateSum[start - 1]) + "\n");
        }
        System.out.println(sb);
    }
}