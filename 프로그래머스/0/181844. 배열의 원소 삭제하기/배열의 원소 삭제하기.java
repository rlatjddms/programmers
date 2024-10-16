import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int num : arr) {
            answer.add(num);
        }
        
        for (int del : delete_list) {
            answer.remove(Integer.valueOf(del));
        }
        
        return answer;
    }
}