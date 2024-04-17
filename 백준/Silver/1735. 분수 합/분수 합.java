
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput = br.readLine().split(" ");
        int bunja1 = Integer.parseInt(firstInput[0]);
        int bunmo1 = Integer.parseInt(firstInput[1]);

        String[] secondInput = br.readLine().split(" ");
        int bunja2 = Integer.parseInt(secondInput[0]);
        int bunmo2 = Integer.parseInt(secondInput[1]);

        int beforeBunja = bunja1 * bunmo2 + bunja2 * bunmo1; // 10
        int beforeBunmo = bunmo1 * bunmo2; //8

        int aliquot = gcd(beforeBunja,beforeBunmo); //최대 공약수
        int afterBunja = beforeBunja/aliquot;
        int afterBunmo = beforeBunmo/aliquot;

        System.out.println(afterBunja + " " + afterBunmo+"\n");


    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}