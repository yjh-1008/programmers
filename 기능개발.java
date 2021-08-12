import java.util.*;
class Solution {
    public int[] solution(int[] pro, int[] speeds) {
        ArrayList<Integer> answer=new ArrayList<Integer>();
        int count=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<pro.length;i++){
            if((100-pro[i])%speeds[i]==0){
                arr.add((100-pro[i])/speeds[i]);
            }else{
                arr.add((100-pro[i])/speeds[i]+1);
            };
        }
        int day=0;
        while(!arr.isEmpty()){
            int temp=0;
            //값을 재거한 뒤에도 배열의 값과 다르게 지움.
            for(int i=0;i<arr.size();i++){
                arr.set(i,arr.get(i)-1);
            }
            if(arr.get(0)<=0){
                arr.remove(0);
                temp++;
                day++;
                while(!arr.isEmpty()){
                    if (arr.get(0) > 0) {
                        break;
                    } else {
                        arr.remove(0);
                        temp++;
                    }

                }
                answer.add(temp);
            }
        }
        int[] an= new int[day];
        for(int i=0;i<an.length;i++){
            an[i]=answer.get(i);
        }
        return an;
    }
}