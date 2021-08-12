class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] chk=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!chk[i]){
                for(int j=i*i;j<=n;j+=i){
                    chk[j]=true;
                }
            }
        }
        for(int i=2;i<chk.length;i++){
            if(chk[i]==false){
                answer++;
            }
        }
        return answer;
    }
}
