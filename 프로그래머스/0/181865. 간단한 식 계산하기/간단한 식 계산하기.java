class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split = binomial.split(" ");
        
        switch(split[1]) {
            case "+":
                answer = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
                break;
            case "-":
                answer = Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
                break;
            case "*":
                answer = Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
                break;
        }
        return answer;
    }
}