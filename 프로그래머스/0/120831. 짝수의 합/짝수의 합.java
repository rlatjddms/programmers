class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while(i<=n){
            answer = answer + i;
            i = i+2;
        }
        return answer;
    }
}