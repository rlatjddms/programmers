class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int a = 0;
        
        for(int i=0; i<index_list.length; i++) {
            a = index_list[i];
            answer += my_string.charAt(a);
        }
        return answer;
    }
}