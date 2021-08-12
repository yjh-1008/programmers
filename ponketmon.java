import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> b=new HashSet<Integer>(Arrays.asList());
        for(int i=0;i<nums.length;i++){
            b.add(nums[i]);
        }
        if(nums.length/2>b.size()){
            answer=b.size();
        }else{
            answer=nums.length/2;
        }
        return answer;
    }
}
