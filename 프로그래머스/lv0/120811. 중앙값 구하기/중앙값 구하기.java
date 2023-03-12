import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //배열 내림차순, 올림차순 정렬할 때 사용
        Arrays.sort(array);
        answer = array[array.length / 2];
        
        return answer;
    }
}