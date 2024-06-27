import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {
            int num = Integer.parseInt(br.readLine());  // 땅의 개수

            for (int i = 0; i < num; i++) {
                st = new StringTokenizer(br.readLine());

                long size = Long.parseLong(st.nextToken()); // 땅의 병사 수를 long으로 처리
                long[] arr = new long[(int)size]; // 배열 크기는 long이지만, 인덱스 접근은 int로

                for (int j = 0; j < size; j++) {
                    arr[j] = Long.parseLong(st.nextToken()); // 병사의 군대 번호를 long으로 처리
                }

                long majority = findMajority(arr, size);

                long count = 0;
                for (int j = 0; j < size; j++) {
                    if (arr[j] == majority) {
                        count++;
                    }
                }

                if (count > size / 2) {
                    System.out.println(majority);
                } else {
                    System.out.println("SYJKGW");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("입력 형식 오류: 숫자로 변환할 수 없는 값이 포함되어 있습니다.");
            e.printStackTrace();
            // 예외 처리 방법을 적절히 선택하여 처리하십시오. 예를 들어, 다른 처리 방법을 선택하거나 프로그램을 종료할 수 있습니다.
        }
    }

    private static long findMajority(long[] arr, long size) {
        long candidate = 0;
        long count = 0;

        for (int i = 0; i < size; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
