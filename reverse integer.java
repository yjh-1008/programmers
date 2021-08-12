class Solution {
    public int[] solution(long n) {

        String[] temp=Long.toString(n).split("");
        int[] answer=new int[temp.length];
        int count=0;
        for(int i=temp.length-1;i>=0;i--){
            answer[count++]=Integer.parseInt(temp[i]);
        }
        return answer;
    }
}
