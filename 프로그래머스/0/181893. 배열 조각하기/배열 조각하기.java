import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int left = 0;
        int right = 0;
        
        for(int i=0; i<query.length; i++) {
            if(i % 2 == 0) {
                right = left + query[i];
            }
            else {
                left += query[i];
            }
        }
        answer = Arrays.copyOfRange(arr, left, right+1);
        
        return answer;
    }
}