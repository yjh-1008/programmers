class Solution {
    public String solution(String s){
        boolean isfirst=true;
        String answer="";
        int count=0;
        do{
            char temp=s.charAt(count++);
            if(Character.isDigit(temp)){
                isfirst=false;
                answer+=Character.toString(temp);
                continue;
            }else if(temp==' '){
                answer+=" ";
                isfirst=true;
                continue;
            }

            if(isfirst==true){
                answer+=Character.toString(temp).toUpperCase();
                isfirst=false;
            }else{
                answer+=Character.toString(temp).toLowerCase();
            }
        }while(count<s.length());
        return answer;
    }
}