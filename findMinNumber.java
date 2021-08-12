import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int min=arr[0];
        if(arr.length==1){
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            if(min>arr[i]){
                min=arr[i];
            }
        }
        while(list.contains(min)){
            int idx=list.indexOf(min);
            list.remove(idx);
        }

        int[] answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){

            answer[i]=list.get(i);

        }

        return answer;

    }
}