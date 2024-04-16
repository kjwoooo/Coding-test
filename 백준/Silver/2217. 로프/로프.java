import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int K = Integer.parseInt(br.readLine());  // 로프의 개수
        Integer[] rope = new Integer[K];

        for (int i = 0; i < K; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope , Comparator.reverseOrder()); // rope 배열을 내림차순 정렬

        int max = rope[0]; // max는 40

        for (int i = 1; i <= rope.length; i++) {
            if ((i * rope[i-1]) > max  ) {
                max = i * rope[i-1];
            }
        }
        System.out.println(max);

    }
}