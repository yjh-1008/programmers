class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero_cnt=0;
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                zero_cnt++;
            }
        }
        int count =0;
        for(int i=0;i<win_nums.length;i++){
            for(int j=0;j<win_nums.length;j++){
                if(win_nums[i]==lottos[j]){
                    count++;
                }
            }
        }
        int[] answer=new int[2];
        if(zero_cnt+count==6){
            answer[0]=1;
        }else if(zero_cnt+count==5){
            answer[0]=2;
        }else if(zero_cnt+count==4){
            answer[0]=3;
        }else if(zero_cnt+count==3){
            answer[0]=4;
        }else if(zero_cnt+count==2){
            answer[0]=5;
        }else{
            answer[0]=6;
        }

        if(count==6){
            answer[1]=1;
        }else if(count==5){
            answer[1]=2;
        }else if(count==4){
            answer[1]=3;
        }else if(count==3){
            answer[1]=4;
        }else if(count==2){
            answer[1]=5;
        }else{
            answer[1]=6;
        }
        return answer;
    }
}