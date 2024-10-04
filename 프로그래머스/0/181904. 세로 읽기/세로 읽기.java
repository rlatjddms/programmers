class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] ch = new char[my_string.length()/m][m];
        int index = 0;
        
        for (int i=0; i<my_string.length()/m; i++) {
            for (int j=0; j<m; j++) {
                ch[i][j] = my_string.charAt(index++);
            }
        }
        for(int i=0; i<ch.length; i++) {
            answer += ch[i][c-1];
        }
        
        return answer;
    }
}