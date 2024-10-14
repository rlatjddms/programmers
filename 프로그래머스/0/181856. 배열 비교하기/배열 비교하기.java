class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        if(arr1.length == arr2.length) {
            for(int i=0; i<arr1.length; i++) {
                a += arr1[i];
                b += arr2[i];
                if(a == b) {
                    answer = 0;
                }
                else {
                    answer = (a > b) ? 1 : -1;
                }
            }
        }
        else if(arr1.length > arr2.length) {
            answer = 1;
        }
        else {
            answer = -1;
        }
        
        return answer;
    }
}