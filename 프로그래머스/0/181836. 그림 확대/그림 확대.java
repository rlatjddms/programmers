import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] picture, int k) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < picture[i].length(); j++) {
                for(int l = 0; l < k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            
            for(int l = 0; l < k; l++) {
                answer.add(sb.toString());
            }
        }
        
        return answer;
    }
}