class Solution {
    public String solution(String s, int n) {
        String answer="";
        for(int i=0;i<s.length();i++){
            int ch=(int)s.charAt(i);

            if(ch>=65&&ch<=90){
                if(ch+n>90){
                    ch=(ch+n)-26;
                }else{
                    ch+=n;
                }
                answer+=(char) ch;
            }else if(ch>=97 && ch<=122){
                if(ch+n>122){
                    ch=(ch+n)-26;
                }else{
                    ch+=n;
                }
                answer+=(char) ch;
            }else{
                answer+=" ";
            }
        }
        return answer;
    }
}