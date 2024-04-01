import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] firstStudentAnswer = new int[10000];
        int[] secondStudentAnswer = new int[10000];
        int[] thirdStudentAnswer = new int[10000];

        int[] firstStudent  =  {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] secondStudent =  {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent  =  {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        // 각 패턴에 맞게 10,000 개의 배열에 담음
        for (int i = 0; i < firstStudentAnswer.length; i++) {
            firstStudentAnswer[i] = firstStudent[ i % firstStudent.length];
            secondStudentAnswer[i] = secondStudent[ i % secondStudent.length];
            thirdStudentAnswer[i] = thirdStudent[ i % thirdStudent.length];
        }

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstStudentAnswer[i]){
                count1++;
            }
            if (answers[i] == secondStudentAnswer[i]){
                count2++;
            }
            if (answers[i] == thirdStudentAnswer[i]) {
                count3++;
            }
        }

        int[] answer = {};

        int max = Math.max(Math.max(count1, count2),count3); // max값 구하기
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==count1) {
            list.add(1); //max값이랑 같으면 넣는다.
        }
        if(max==count2) {
            list.add(2);
        }
        if(max==count3){
            list.add(3);
        }

        answer = new int[list.size()];

        for(int i =0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
}
}