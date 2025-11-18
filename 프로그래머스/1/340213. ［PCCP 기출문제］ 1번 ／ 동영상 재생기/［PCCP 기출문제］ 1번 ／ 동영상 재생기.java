class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] posParts = pos.split(":");
        String[] startParts = op_start.split(":");
        String[] endParts = op_end.split(":");
        String[] videoParts = video_len.split(":");
        
        int posTime = Integer.parseInt(posParts[0]) * 60 + Integer.parseInt(posParts[1]);
        int startTime = Integer.parseInt(startParts[0]) * 60 + Integer.parseInt(startParts[1]);
        int endTime = Integer.parseInt(endParts[0]) * 60 + Integer.parseInt(endParts[1]);
        int videoTime = Integer.parseInt(videoParts[0]) * 60 + Integer.parseInt(videoParts[1]);
        
        for(int i=0; i<commands.length; i++){
            if(posTime >= startTime && posTime <= endTime) posTime = endTime;
            if(commands[i].equals("prev")){
                if(posTime < 10) posTime = 0;
                else posTime -= 10;
            }else{
                posTime += 10;
                if(posTime > videoTime) posTime = videoTime;
            }
            if(posTime >= startTime && posTime <= endTime) posTime = endTime;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", posTime / 60));
        posTime %= 60; 
        sb.append(":");
        sb.append(String.format("%02d", posTime));
        return sb.toString();
    }
}