class Solution {
    public int solution(int n) {
        StringBuilder sb=new StringBuilder();
        while(n/3>0){
            sb.append(n%3);
            n=n/3;
        }
        sb.append(n);
        int answer=0;
        int cnt=sb.length()-1;
        for(int i=0;i<sb.length();i++){
            answer+=Character.getNumericValue(sb.charAt(i))*Math.pow(3,cnt--);
        }

        return answer;
    }
}