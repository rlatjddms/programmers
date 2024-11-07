import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] arr = before.toCharArray();
        char[] arr2 = after.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        String strArr = new String(arr);
        String strArr2 = new String(arr2);
        
        if(strArr.equals(strArr2)) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}