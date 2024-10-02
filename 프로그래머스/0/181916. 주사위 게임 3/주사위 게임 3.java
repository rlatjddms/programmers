import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        if(dice[0] == dice[3]) answer = a * 1111;
        else if(dice[0] == dice[2] || dice[1] == dice[3]) {
            answer = (int) Math.pow(10 * dice[1] + (dice[0] + dice[3] - dice[1]), 2);
        }
        else if(dice[0] == dice[1] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[2]) * (dice[2] - dice[0]);
        }
        else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
            
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
            
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
            
        } else if (dice[3] == dice[0]) {
            answer = dice[1] * dice[2];
        }else {
            answer = dice[0];
        }
        
        return answer;
    }
}