class Solution {
    boolean solution(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(count==0 &&s.charAt(i)==')'){
                return false;
            }
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}