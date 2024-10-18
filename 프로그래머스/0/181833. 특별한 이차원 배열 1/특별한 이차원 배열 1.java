class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                answer[j][j] = 1;
            }
        }
        return answer;
    }
}