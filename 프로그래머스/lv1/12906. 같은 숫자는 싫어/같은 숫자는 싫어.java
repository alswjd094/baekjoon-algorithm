import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
//         배열크기 알 수 없으므로 arraylist 생성
        ArrayList<Integer> list = new ArrayList<>();
//         length: 배열의 길이 / size: ArrayList의 길이
        for(int i = 0 ; i < arr.length ; i++){
            if(i==0){
                list.add(arr[i]);
            }else{
              if(arr[i]!=arr[i-1]){
                    list.add(arr[i]);
                }
            }
        }
        
        answer = new int[list.size()];
        for(int i =0 ; i<list.size() ; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
        }