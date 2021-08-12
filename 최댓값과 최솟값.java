import java.util.ArrayList;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] c=s.split(" ");
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<c.length;i++){
            arr.add(Integer.parseInt(c[i]));
        }
        int min=arr.get(0);
        int max=arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(min>arr.get(i)){
                min=arr.get(i);
            }
            if(max<arr.get(i)){
                max=arr.get(i);
            }
        }
        answer=Integer.toString(min)+" "+Integer.toString(max);
        return answer;
    }
}