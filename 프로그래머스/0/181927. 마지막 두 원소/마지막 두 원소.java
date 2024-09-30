class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        int lastNum = 0;
        
        if(num_list[length-1] > num_list[length-2]) {
            lastNum = num_list[length-1] - num_list[length-2];
        }
        else {
            lastNum = num_list[length-1] * 2;
        }
        for(int i=0; i<length; i++) {
            answer[i] = num_list[i];
        }
        answer[length] = lastNum;
        
        return answer;
    }
}