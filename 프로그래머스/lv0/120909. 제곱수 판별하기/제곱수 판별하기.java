import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
//         특정값의 제곱근 구할 때 사용
        if(Math.sqrt(n)%1 == 0){
             answer = 1;
        }else{
             answer = 2;
        }
        return answer;
    }
}