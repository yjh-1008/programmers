class Solution {
    public int solution(int n) {
        int nb=n;
        int count=0;
        int answer=0;
        while(nb>0){
            if(nb%2==1){
                count++;
            }
            nb=nb/2;
        }
        while(true){
            n++;
            int count2=0;
            nb=n;
            while(nb>0){
                if(nb%2==1){
                    count2++;
                }
                nb/=2;
            }
            if(count2==count){
                answer=n;
                break;
            }
        }
        return answer;
    }
}