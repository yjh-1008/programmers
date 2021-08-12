import java.util.*;
class Solution {
    static private void per(String a,HashSet<Integer> p,boolean[] chk,int r,String temp){
        if(temp.length()==a.length()){
            return;
        }
        for(int i=0;i<a.length();i++){
            if(!chk[i]){
                chk[i]=true;
                temp+=a.charAt(i);
                per(a,p,chk,r+1,temp);
                p.add(Integer.parseInt(temp));
                temp=temp.substring(0,temp.length()-1);
                chk[i]=false;
            }
        }
    }
    public int solution(String a) {
        int answer=0;
        int r=0;
        String temp="";
        boolean[] chk=new boolean[a.length()];
        HashSet<Integer> permutation= new HashSet<Integer>();
        //문자열 나눠서 구하기
        per(a,permutation,chk,r,temp);
        //true면 소수가 아님
        //소수부터 정하기
        ArrayList<Integer> result=new ArrayList<Integer>(permutation);
        for(int i=0;i<result.size();i++){
            boolean aa=true;
            if(result.get(i)==0||result.get(i)==1){
                continue;
            }
            for(int j=2;j<=Math.sqrt(result.get(i));j++){
                if(result.get(i)%j==0){
                    aa=false;
                }
            }
            if(aa){
                answer++;
            }
        }
        return answer;
    }
}