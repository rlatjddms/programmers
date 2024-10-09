class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        String[] arr = myString.split("");
        int start = 0;
        
        if (myString.length() < pat.length()) {
            return answer;
        }
        
        while (true) {
            String a = "";
            
            for (int i=start; i<start+pat.length(); i++) {
                a += arr[i];
            }
            start++;
            
            if (a.equals(pat)) {
                answer = 1;
                break;
            }
            if (start > (myString.length() - pat.length())) {
                break;
            }
        }

        return answer;
    }
}