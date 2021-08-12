import java.util.Collections;
import java.util.Locale;
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] temp=Long.toString(n).split("");
        Arrays.sort(temp,Collections.reverseOrder());
        long answer=0;
        int count=temp.length-1;
        for(int i=0;i<temp.length;i++){
            answer+=Long.parseLong(temp[i])*Math.pow(10,count);
            count--;
        }
        return answer;
    }
}
