import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if (answer.size() == k) {
                break;
            }
            if(!answer.contains(arr[i])) {
                answer.add(arr[i]);
            }
        }
        for(int i=0; i<=k; i++) {
            if(i > answer.size()) {
                answer.add(-1);
            }
        }
        
        return answer;
    }
}