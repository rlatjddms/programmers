class Solution {
    public String solution(int age) {
        String answer = "";
        String a = String.valueOf(age);
        
        for(int i=0 ; i<a.length(); i++){
            answer += (char)((char)a.charAt(i)+49);
        }
        
        return answer;
    }
}