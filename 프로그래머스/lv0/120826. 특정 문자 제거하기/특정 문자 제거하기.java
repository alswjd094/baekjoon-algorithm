class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
//         String.replce(target, replacement);
        answer = my_string.replace(letter,"");
        return answer;
    }
}