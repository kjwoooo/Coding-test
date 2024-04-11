import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nono = br.readLine().split(" ");
        int noSee = Integer.parseInt(nono[0]);
        int noHear = Integer.parseInt(nono[1]);

        Set<String> notSee = new TreeSet<>();   // 보지 못한 애들
        Set<String> notHear = new TreeSet<>();  // 듣지 못한 애들

        for (int i = 0; i < noSee; i++) {
            notSee.add(br.readLine());
        }

        for (int i = 0; i < noHear; i++) {
            notHear.add(br.readLine());
        }

        notSee.retainAll(notHear); // 교집합 냅두고 삭제

        System.out.println(notSee.size());
        for (String name : notSee) {
            System.out.println(name);
        }
    }
}