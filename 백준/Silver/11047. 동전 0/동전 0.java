import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int coinCnt = Integer.parseInt(input[0]);
        int targetPrice = Integer.parseInt(input[1]);

        int[] pocket = new int[coinCnt];    // 돈의 종류만큼 지갑을 생성

        for (int i = 0; i < coinCnt; i++) {
            pocket[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int i = pocket.length - 1;

        while (targetPrice > 0 && i >= 0) {
            if (pocket[i] <= targetPrice) {
                int numCoins = targetPrice / pocket[i];
                count += numCoins;
                targetPrice -= numCoins * pocket[i];
            }
            i--;
        }
        System.out.println(count);
    }
    
    

  }

      

    
    
