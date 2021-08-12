import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer="";
        String[] num=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            num[i]=String.valueOf(numbers[i]);
        }
        //10,6,2
        Arrays.sort(num,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
        if(num[0].equals("0")){
            return "0";
        }
        for(int i=0;i<num.length;i++){
            answer+=num[i];
        }
        return answer;
    }
}