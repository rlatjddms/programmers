import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++){
            count[strArr[i].length()]++;
        }

        Arrays.sort(count);
        answer = count[count.length - 1];
        
        return answer;
    }
}