class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        char[][] map = new char[park.length][park[0].length()];
        
        for(int i = 0; i < park.length; i++){
            map[i] = park[i].toCharArray();
            
            if(park[i].contains("S")){
                y = i;
                x = park[i].indexOf("S");
            }
        }
        
        
    for(String route : routes){
            String way = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            
            int nx = x;
            int ny = y;
            
            for(int i=0; i<distance; i++){
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }
                if(nx >=0 && ny >=0 && ny < map.length && nx < map[0].length){
                    if(map[ny][nx] == 'X'){
                        break;
                    }
                    
                    if(i == distance-1){
                        x = nx;
                        y = ny;
                    }
                }
            }
        }       
        
        int[] answer = {y, x};
        return answer;
    }
}