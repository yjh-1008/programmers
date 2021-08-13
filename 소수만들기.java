class Solution {
    public int solution(int[] nums) {
        boolean[] Sieve=new boolean[3000];
        Sieve[0]=true;
        Sieve[1]=true;
        //에라토스테네스의 체
        for(int i=2;i<Sieve.length;i++){
            if(!Sieve[i]){
                for(int j=i;j*i<Sieve.length-1;j++){
                    Sieve[j*i]=true;
                }
            }
        }
        int answer=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length ;k++){
                    if(!Sieve[nums[i]+nums[j]+nums[k]]){
                        answer++;
                    }

                }
            }
        }
        return answer;
    }
}