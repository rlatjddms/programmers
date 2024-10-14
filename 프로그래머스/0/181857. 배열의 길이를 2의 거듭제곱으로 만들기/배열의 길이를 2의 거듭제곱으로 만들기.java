import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int length = 1;
        
        while(length < arr.length) {
            length *= 2;
        }
        for(int i=0; i<length; i++) {
            if(i < arr.length) {
                answer.add(arr[i]);
            }
            else {
                answer.add(0);
            }
        }
        
        return answer;
    }
}