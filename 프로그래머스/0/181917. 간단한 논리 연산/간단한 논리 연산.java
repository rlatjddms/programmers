class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        if(x1 == false && x2 == false) {
            answer = false;
        }
        if(x3 == false && x4 == false) {
            answer = false;
        }
        return answer;
    }
}