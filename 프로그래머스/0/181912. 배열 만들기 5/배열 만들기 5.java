import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            char[] ch = intStrs[i].toCharArray();
            String a = "";
            for(int j=s; j<s+l; j++){
              a += Character.toString(ch[j]);
            }
            if(k < Integer.parseInt(a)) {
                answer.add(Integer.parseInt(a));
            }
        }
        return answer;
    }
}