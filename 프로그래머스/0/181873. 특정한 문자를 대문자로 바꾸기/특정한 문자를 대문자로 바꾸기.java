class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) == alp.charAt(0)) {
                answer.append(Character.toUpperCase(my_string.charAt(i)));
            }
            else {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}