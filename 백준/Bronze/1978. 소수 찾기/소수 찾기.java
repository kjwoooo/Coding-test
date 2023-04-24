import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a;
        int cnt=0;
        for(int i=0; i<num; i++)
        {
            a = sc.nextInt();
            for(int j=2; j<=a; j++){
                if(j == a){
                    cnt++;
                }
                if(a % j == 0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
