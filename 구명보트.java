import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer=0;
        ArrayList<Integer> peo=new ArrayList<Integer>();
        for(int i=0;i<people.length;i++){
            peo.add(people[i]);
        }
        int i;
        while(!peo.isEmpty()){
            int last=peo.remove(peo.size()-1);
            if(peo.isEmpty()==false&&last+peo.get(0)<=limit) {
                peo.remove(0);
            }
            answer++;
        }
        return answer;
    }
}