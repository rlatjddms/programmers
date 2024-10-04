class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        StringBuilder a = new StringBuilder(my_string.substring(s, e+1));
        a.reverse();
        answer = my_string.substring(0, s) + a + my_string.substring(e+1);
        
        return answer;
    }
}