import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean index = true;
        
        for(int i=l; i<=r; i++) {
            String a = Integer.toString(i);
            for(int j=0; j<a.length(); j++) {
                if(a.charAt(j) == '5' || a.charAt(j) == '0'){
                    index = true;
                }
                else {
                    index = false;
                    break;
                }
            }
            if(index == true) {
                answer.add(i);
            }
        }
        
        if(answer.isEmpty()){ 
          answer.add(-1);
        }
        
        return answer;
    }
}