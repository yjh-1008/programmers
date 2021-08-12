import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap=new HashMap<String,Integer>();
        int answer=1;
        for(int i=0;i<clothes.length;i++){
            if(!hashMap.containsKey(clothes[i][1])){
                hashMap.put(clothes[i][1],1);
            }else{
                hashMap.put(clothes[i][1], hashMap.get(clothes[i][1]) + 1);
            }
        }

        Set<String> keySet = hashMap.keySet();
        for(String key : keySet) {
            answer *= hashMap.get(key)+1;
        }
        return answer-1;
    }
}