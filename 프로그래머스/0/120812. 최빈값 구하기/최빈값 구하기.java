import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int count = 0;
        
        Arrays.sort(array);
        max = array[array.length - 1];
        
        int cnt[] = new int[max + 1];
        for(int i=0; i<array.length; i++){
            cnt[array[i]]++;
        }
        
        for(int i=0; i<cnt.length; i++){
            if(count < cnt[i]) {
                count = cnt[i];
                answer = i;
            } else if(count == cnt[i]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}