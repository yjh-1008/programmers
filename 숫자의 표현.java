class Solution {
    public int solution(int a) {
        int answer=0;
        for(int i=1;i<=a;i++){
            int sum=i;
            int temp=i+1;
            do{
                if(sum==a){

                    answer++;
                    break;
                }else if(sum<a){

                    sum+=temp;
                    temp++;
                }else{
                    break;
                }
            }while(sum<=a);
        }
        return answer;
    }
}