class Solution {
    public String solution(String number, int k) {
        int idx=0;
        StringBuilder answer=new StringBuilder();
        while(true){
            if(k==number.length()){
                break;
            }
            char max=0;
            for(int i=idx;i<k+1;i++){
                if(max<number.charAt(i)){
                    max=number.charAt(i);
                    idx=i+1;
                    if(max==9){
                        break;
                    }
                }
            }
            answer.append(max);
            k++;
        }
        return answer.toString();
    }
}