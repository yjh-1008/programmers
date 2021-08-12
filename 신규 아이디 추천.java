class Solution {
    public String solution(String new_id) {
        String answer;
        //1단
        answer=new_id.toLowerCase();
        StringBuilder sb=new StringBuilder();
        //2단계
        for(int i=0;i<answer.length();i++){
            if(answer.charAt(i)=='-' ||answer.charAt(i)=='_'||answer.charAt(i)=='.'){
                sb.append(answer.charAt(i));
            }else if((answer.charAt(i)>='a' && answer.charAt(i)<='z') || (answer.charAt(i)>='0' &&answer.charAt(i)<='9')){
                sb.append(answer.charAt(i));
            }
        }
        answer=sb.toString();
        boolean chk_comma=false;
        sb=new StringBuilder();
        //3단
        for(int i=0;i<answer.length();i++) {
            if (answer.charAt(i) == '.' && !chk_comma) {
                sb.append(answer.charAt(i));
                chk_comma = true;
            } else if (answer.charAt(i) == '.' && chk_comma) {
                continue;
            } else {
                sb.append(answer.charAt(i));
                chk_comma = false;
            }
        }
        //4단
        answer=sb.toString();
        sb=new StringBuilder();
        for(int i=0;i<answer.length();i++){
            if(answer.charAt(i)=='.' &&(i==0||i==answer.length()-1)){
                continue;
            }else{
                sb.append(answer.charAt(i));
            }
        }
        answer=sb.toString();
        //5단계
        if(answer.length()==0){
            answer="a";
        }
        System.out.println(answer);
        //6단계
        if ( answer.length() > 15 ) {
            answer = answer.substring(0, 15);
            if ( answer.charAt(answer.length()-1) == '.' )
                answer = answer.substring(0, answer.length()-1);
        }
        if(answer.length()<3){
            while(answer.length()!=3){
                answer+=answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}