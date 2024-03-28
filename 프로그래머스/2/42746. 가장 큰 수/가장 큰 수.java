
import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] strNumber = new String[numbers.length]; // 정수를 문자로 만들어 담을 배열 생성

        //int[] numbers = {6, 10, 2};

        for (int i = 0; i < numbers.length; i++) {
            strNumber[i] = String.valueOf(numbers[i]);
        }  // --->  //String[] strNumbers = {'6', '10', '2'};

        Arrays.sort(strNumber, (a, b) -> (b + a).compareTo(a + b));
        /*
        * 1. compareTo을 이용한 정렬
        * 2. sort에 대한 기준을 만듬
        * 3. if a='6', b='10'
        * -> 106.compareTo(610)
        * -> + 내림차순 , - 내림차순
        *
        *
        * */
        
         if (strNumber[0].equals("0")) {
            return "0";
        }

        for (String i : strNumber){
            answer+= i;
        }


        return answer;
        }

    }