import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> indexList = new ArrayList<>();
        
        for(int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                indexList.add(i);
            }
        }
        indexList.sort((a, b) -> Integer.compare(rank[a], rank[b]));
        answer = 10000 * indexList.get(0) + 100 * indexList.get(1) + indexList.get(2);
        
        return answer;
    }
}