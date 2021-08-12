class Solution
{
    public int solution(int [][]board)
    {
        int max=0;
        if(board.length==1){
            for(int i=0;i<board[0].length;i++){
                if(max<board[0][i]){
                    max=board[0][i];
                }
            }
        }else if(board[0].length==1){
            for(int i=0;i<board.length;i++){
                if(max<board[i][0]){
                    max=board[i][0];
                }
            }
        }else if(board.length>1&&board[0].length>1){
            for (int i = 1; i < board.length; i++) {
                for (int j = 1; j < board[0].length; j++) {
                    if (board[i][j] == 1) {
                        board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]),
                                board[i - 1][j - 1])+1;
                        if (max < board[i][j]) {
                            max = board[i][j];
                        }
                    }
                }
            }
        }
        return max*max;
    }
}