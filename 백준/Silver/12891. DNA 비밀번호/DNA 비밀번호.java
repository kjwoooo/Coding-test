
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = br.readLine().split(" ");
        int DNALen = Integer.parseInt(firstInput[0]);  // 입력 받을 DNA 문자열 길이
        int secLen = Integer.parseInt(firstInput[1]);  // 부분 문자열 길이

        Deque<String> password = new ArrayDeque<>(secLen);

        String DNAstr = br.readLine();     // DNA 문자열  ex) GATA

        int CanPassword = 0; // 조건에 맞는 비밀번호 개수

        String[] filters = br.readLine().split(" "); //PW 조건 {‘A’, ‘C’, ‘G’, ‘T’}
        int filterA = Integer.parseInt(filters[0]);
        int filterC = Integer.parseInt(filters[1]);
        int filterG = Integer.parseInt(filters[2]);
        int filterT = Integer.parseInt(filters[3]);

        int filterA_p = 0;
        int filterC_p = 0;
        int filterG_p = 0;
        int filterT_p = 0;

        for (int i = 0; i < DNAstr.length(); i++) {
            String str = String.valueOf(DNAstr.charAt(i));

            password.offer(str); // 처음 들어갈 떄 해당하는 문자를 증가, 두번째 부터 해당하는 문자를 증가시켜줌
            if (str.equals("A")) filterA_p++;
            if (str.equals("C")) filterC_p++;
            if (str.equals("G")) filterG_p++;
            if (str.equals("T")) filterT_p++;

            // 부분 문자열의 각각 해당하는 문자의 개수가 저장됨
            if (password.size() == secLen) {
                if (filterA_p >= filterA && filterC_p >= filterC
                        && filterG_p >= filterG && filterT_p >= filterT) {  // 입력 받은 조건에 부합하다면
                    CanPassword++;
                }
                String removed = password.pollFirst(); // 맨 앞의 요소 제거

                if (removed.equals("A")) filterA_p--;
                if (removed.equals("C")) filterC_p--;
                if (removed.equals("G")) filterG_p--;
                if (removed.equals("T")) filterT_p--;
            }
        }
        System.out.println(CanPassword);
    }
}

