import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> qu=new LinkedList<Integer>();
        int answer=0;
        int total_weight=0;
        int idx=0;
        while(true){
            //모든 트럭이 지나간 경우
            if(idx==truck_weights.length){
                break;
            }
            if(qu.size()==bridge_length){
                total_weight-=qu.poll();
            }
            if(total_weight+truck_weights[idx]>weight){
                qu.add(0);
                answer++;
            }else{
                qu.add(truck_weights[idx]);
                total_weight+=truck_weights[idx++];
                answer++;
            }


        }
        return answer+bridge_length;
    }
}