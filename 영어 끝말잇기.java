import java.util.*;
class LinkedList{
    static public void main(String[] args){
        int n=3;
        String[] words={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();
        ArrayList<String> arr = new ArrayList<String>();
        int answer[]=new int[2];
        for(int i=0;i<words.length;i++){
            if(!arr.contains(words[i])){
                arr.add(words[i]);
                if(!hashMap.containsKey(i%n)){
                    hashMap.put(i%n,1);
                }else{
                    hashMap.put(i%n,(hashMap.get(i%n))+1);
                }
            }else if(arr.contains(words[i])){
                answer[0]=(i%n)+1;
                answer[1]=hashMap.get(i%n)+1;
                break;
            }
            if(i>0 && words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0) ){
                System.out.println(words[i]);
                answer[0]=(i%n)+1;
                answer[1]=hashMap.get(i%n);
                break;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}