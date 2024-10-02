class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            
            StringBuilder reverse = new StringBuilder(answer.substring(a, b + 1));
            reverse.reverse();
            
            if (a == 0) {
                answer = reverse + answer.substring(b + 1);
            } else {
                answer = answer.substring(0, a) + reverse + answer.substring(b + 1);
            }
        }
        
        return answer;
    }
}