class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int div_brown=brown/2;
        int width=0;
        int height=0;
        for(int i=3;i<=div_brown;i++){
            for(int j= 3;j<=i;j++){
                if((i-2)*(j-2)==yellow&& (i-2)+j==div_brown){
                    answer[0]=i;
                    answer[1]=j;
                    break;
                }
            }
            if(answer[0]>0&&answer[1]>0){
                break;
            }
        }
        return answer;
    }
}