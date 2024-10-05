class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i=0; i<indices.length; i++) {
            int a = indices[i];
            answer.setCharAt(a, ' ');
        }
        
        return answer.toString().replace(" ", "");
    }
}