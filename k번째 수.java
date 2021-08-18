import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int first=commands[i][0]-1;
            int last=commands[i][1];
            int[] temp= Arrays.copyOfRange(array,first,last);
            Arrays.sort(temp);
            answer[i]=temp[commands[i][2]-1];
        }
        return answer;
    }
}