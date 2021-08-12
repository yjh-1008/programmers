class Solution {
    public int[][] solution(int[][] a, int[][] b) {
        int[][] answer =new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<b.length;k++){
                    answer[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return answer;
    }
}