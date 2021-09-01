import java.util.ArrayList;
class Solution {
    public int solution(String dirs) {
        int answer=0;
        int x=0, y=0;//좌표를 옮길 변수
        String temp;
        String reverse_temp;
        ArrayList<String> arr=new ArrayList<>();
        int count=0;
        for(int i=0;i< dirs.length();i++){
            char command=dirs.charAt(i);
            temp=Integer.toString(x)+Integer.toString(y);
            int past_x=x;
            int past_y=y;
            if(command=='U' && y+1<=5){
                y=y+1;
                temp+=Integer.toString(x)+Integer.toString(y);
                reverse_temp=Integer.toString(x)+Integer.toString(y)+Integer.toString(past_x)+Integer.toString(past_y);
                if(!arr.contains(temp) && !arr.contains(reverse_temp)){
                    answer++;
                    arr.add(temp);
                    arr.add(reverse_temp);
                }
            }else if(command=='D' && y-1>=-5){
                y=y-1;
                temp+=Integer.toString(x)+Integer.toString(y);
                reverse_temp=Integer.toString(x)+Integer.toString(y)+Integer.toString(past_x)+Integer.toString(past_y);
                if(!arr.contains(temp) && !arr.contains(reverse_temp)){
                    answer++;
                    arr.add(temp);
                    arr.add(reverse_temp);
                }
            } else if(command=='L' &&x-1>=-5){
                x=x-1;
                reverse_temp=Integer.toString(x)+Integer.toString(y)+Integer.toString(past_x)+Integer.toString(past_y);
                if(!arr.contains(temp) && !arr.contains(reverse_temp)){
                    answer++;
                    arr.add(temp);
                    arr.add(reverse_temp);
                }
            }else if(command=='R' && x+1<=5){
                x=x+1;
                temp+=Integer.toString(x)+Integer.toString(y);
                reverse_temp=Integer.toString(x)+Integer.toString(y)+Integer.toString(past_x)+Integer.toString(past_y);
                if(!arr.contains(temp) && !arr.contains(reverse_temp)){
                    answer++;
                    arr.add(temp);
                    arr.add(reverse_temp);
                }
            }
        }
        return answer;
    }
}