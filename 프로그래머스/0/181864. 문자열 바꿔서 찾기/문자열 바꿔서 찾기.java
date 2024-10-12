class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder a = new StringBuilder(myString);
        
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                a.setCharAt(i, 'B');
            }
            else if(myString.charAt(i) == 'B') {
                a.setCharAt(i, 'A');
            }
        }
        String result = a.toString();
        
        if(result.contains(pat)) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        
        return answer;
    }
}