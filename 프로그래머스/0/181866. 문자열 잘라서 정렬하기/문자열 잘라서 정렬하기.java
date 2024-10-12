import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitArray = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        for (String s : splitArray) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}