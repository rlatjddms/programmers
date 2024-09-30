class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int i=0; i<control.length(); i++) {
            char a = control.charAt(i);
            if(a == 'w') {
                answer++;
            }
            else if(a == 's') {
                answer--;
            }
            else if(a == 'd') {
                answer += 10;
            }
            else {
                answer -= 10;
            }
        }
        return answer;
    }
}