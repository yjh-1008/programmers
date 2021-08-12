class Solution {
    public String solution(int[][] scores) {
        int i;
        int j;
        int min=0;
        int max=0;
        int sum;
        float avg;
        int cnt_max;
        int cnt_min;
        StringBuilder sb=new StringBuilder();
        for(i=0;i<scores.length;i++){
            sum=0;
            min=100;
            max=0;
            avg=0;
            cnt_max=Integer.MIN_VALUE;
            cnt_min=Integer.MAX_VALUE;;
            for(j=0;j<scores[0].length;j++){
                if(scores[j][i]>max){
                    max=scores[j][i];
                    cnt_max=1;
                }else if(scores[j][i]==max){
                    cnt_max++;
                }
                if(scores[j][i]<min){
                    min=scores[j][i];
                    cnt_min=1;
                }else if(scores[j][i]==min){
                    cnt_min++;
                }
                sum+=scores[j][i];
            }
            if((scores[i][i]==min && cnt_min==1) ||( scores[i][i]==max &&cnt_max==1 )){

                sum-=scores[i][i];
                avg=(float)sum/(scores.length-1);

            }else{
                avg=(float)sum/scores.length;
            }
            if(avg>=90){
                sb.append("A");
            }else if(avg>=80 && avg<90){
                sb.append("B");
            }else if(avg>=70 && avg<80){
                sb.append("C");
            }else if(avg>=50 && avg<70){
                sb.append("D");
            }
            else if(avg<50){
                sb.append("F");
            }
        }
        return sb.toString();
    }
}