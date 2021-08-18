import java.util.*;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        LinkedList<Integer> arr=new LinkedList<Integer>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j && !arr.contains(numbers[i]+numbers[j])){
                    arr.add(numbers[i]+numbers[j]);
                }
            }
        }
        Collections.sort(arr);
        int answer[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}