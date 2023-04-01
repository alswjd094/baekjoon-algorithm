import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String s [] = String.valueOf(n).split("");
        
        for(int i = 0 ; i < s.length ; i++){
//             문자열을 숫자열로 변환시키는 방법
            answer += Integer.parseInt(s[i]);
        }
        return answer;
    }
}