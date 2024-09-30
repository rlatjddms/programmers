class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            int a = 1000000;
            for(int j=queries[i][0]; j<queries[i][1]+1; j++) {
                if(queries[i][2] < arr[j] && arr[j] < a) {
                    a = arr[j];
                }
            }
            if (a == 1000000) {
                answer[i] = -1;
            } else {
                answer[i] = a;
            }
        }
        return answer;
    }
}