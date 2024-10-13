import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        String[] split = myStr.split("[abc]+");
        ArrayList<String> answer = new ArrayList<>();
        
        for (String a : split) {
            if (!a.isEmpty()) {
                answer.add(a);
            }
        }
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}