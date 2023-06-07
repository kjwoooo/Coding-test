import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 입력받을 카드의 개수
    int m = sc.nextInt(); // 지정한 블랙잭
    
    int[] arr = new int[n];
    for(int i= 0; i< n; i++){
      arr[i] = sc.nextInt(); // 입력 받을 카드들
    } 

    Arrays.sort(arr); // 입력 받은 카드들을 정렬
    int sum =0; // 카드들의 합
    int aaa = 0;

      for(int i=0; i<n; i++){ // 0번째 부터 순회
        for(int j=i+1; j<n; j++){ // j(i+1) 부터 순회
          for(int k=j+1; k<n; k++){// k(j+1) 부터 순회
             sum = arr[i] + arr[j] + arr[k]; //각각의 자리의 값을 저장
            if(sum <= m && sum >= aaa) 
              aaa = sum;
                //설정한 블랙잭 수보다 작거나 같고, 이전의 근사치값보다 
                //크다면 aaa에 새로운 값으로 초기화
          }
        }
      }
    System.out.println(aaa);
  }
}


