import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>(k);
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            list.sort(Comparator.naturalOrder());
            if (list.size() > k) {
                list.remove(0);
            }
            answer[i] = list.get(0);
        }
        
        return answer;
    }
}