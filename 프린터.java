import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue=
                new PriorityQueue<Integer>(Comparator.reverseOrder());
        int answer=0;
        for(int i=0;i< priorities.length;i++){
            queue.add(priorities[i]);
        }
        while(!queue.isEmpty()){
            for(int i=0;i< priorities.length;i++){
                if(queue.peek()==priorities[i]){
                    queue.poll();
                    answer++;

                    if(i==location){
                        queue.clear();
                        break;
                    }
                }
            }
        }
        return answer;
    }
}