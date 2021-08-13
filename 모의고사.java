import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[][] user={{1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}};
        ArrayList<Integer> answer=new  ArrayList<Integer>();
        int count;
        int max=Integer.MIN_VALUE;
        int cnt_idx=0;
        for(int i=0;i< user.length;i++){
            count=0;
            for(int j=0;j<answers.length;j++){
                if(user[i][j%user[i].length]==answers[j]){
                    count++;
                }

            }
            if(max<count){
                answer=new ArrayList<Integer>();
                answer.add(i+1);
                max=count;
            }else if(max ==count){

                answer.add(i+1);
            }
        }
        int[] an=new int[answer.size()];
        for(int i=0;i<an.length;i++){
            an[i]=answer.get(i);
        }
        return an;
    }
}