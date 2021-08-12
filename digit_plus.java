import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] a=Integer.toString(n).split("");
        int answer=0;
        for(int i=0;i<a.length;i++){
            answer+=Integer.parseInt(a[i]);

        }
        return answer;
    }
}
