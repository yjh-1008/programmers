class Solution {
    public String solution(String num) {
        String[] n=num.split("");
        String answer="";
        for(int i=0;i<num.length()-4;i++){
            n[i]="*";
        }
        for(int i=0;i<num.length();i++){
            answer+=n[i];
        }
        return answer;
    }
}
