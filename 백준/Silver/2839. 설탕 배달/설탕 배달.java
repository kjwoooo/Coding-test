
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int count = 0;

        while(true) {

            if(sugar % 5 == 0){
                count += sugar/5;
                System.out.println(count); //5개의 주머니로 나누어지면 그만큼 반환 
                break;
            }else {
                sugar-=3; // 3개짜리 주머니를 사용하여 -3 을 하고 다시 5개의 주머니를 판별
                count++;
            }
            if (sugar < 0){
                System.out.println(-1);
                break;
            }
        }


    }
}