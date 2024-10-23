class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int add = 0;
        for(int i=0; i<numbers.length; i++) {
        	add = add + numbers[i];
        }
        answer = (double)add/numbers.length;
        return answer;
    }
}