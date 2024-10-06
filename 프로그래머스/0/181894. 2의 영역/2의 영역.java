import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        int first = list.indexOf(2);
        int last = list.lastIndexOf(2);
        
        if (first == -1) {
            answer.add(-1);
        } else {
            answer.addAll(list.subList(first, last + 1));
        }
        
        return answer;
    }
}