class Solution {
    public int solution(int[] numbers, int target) {
        int answer=0;
        int prev=numbers[0];
        answer+=dfs(target,numbers,prev,1);
        answer+=dfs(target,numbers,-prev,1);
        return answer;
    }
    public int dfs(int target, int[] numbers,int prev,int start){
        if(start==numbers.length){
            if(prev==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        int cur1=prev+numbers[start];
        int cur2=prev-numbers[start];
        int ans=0;
        ans+=dfs(target,numbers,cur1,start+1);
        ans+=dfs(target,numbers,cur2,start+1);
        return ans;
    }
}