class Solution {
    public String solution(int[] numbers, String hand) {
        int[][] num={{1,2,3},{4,5,6},{7,8,9},{Integer.MAX_VALUE,0,Integer.MIN_VALUE}};
        StringBuilder sb=new StringBuilder();
        int left_row = 3;
        int left_col=0;
        int right_row=3;
        int right_col=2;
        int middle_row=0;
        int middle_col=1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1 ||numbers[i]==4 || numbers[i]==7){
                left_col=0;
                for(int j=0;j<num.length;j++){
                    if(num[j][left_col]==numbers[i]){
                        left_row=j;
                        break;
                    }
                }
                sb.append("L");
            }else if(numbers[i]==3 ||numbers[i]==6 || numbers[i]==9){
                right_col=2;
                for(int j=0;j<num.length;j++){
                    if(num[j][right_col]==numbers[i]){
                        right_row=j;
                        break;
                    }
                }
                sb.append("R");
            }else{
                for(int j=0;j<num.length;j++){
                    if(num[j][middle_col]==numbers[i]){
                        middle_row=j;
                        break;
                    }
                }
                if((Math.abs(left_row-middle_row)+Math.abs(left_col-middle_col))>
                        (Math.abs(right_row-middle_row)+Math.abs(right_col-middle_col))){
                    right_row=middle_row;
                    right_col=middle_col;
                    sb.append("R");
                }else if((Math.abs(left_row-middle_row)+Math.abs(left_col-middle_col))<
                        (Math.abs(right_row-middle_row)+Math.abs(right_col-middle_col))){
                    left_row=middle_row;
                    left_col=middle_col;
                    sb.append("L");
                }else{
                    if(hand.equals("right")){
                        right_row=middle_row;
                        right_col=middle_col;
                        sb.append("R");
                    }else{
                        left_row=middle_row;
                        left_col=middle_col;
                        sb.append("L");
                    }
                }

            }
        }
        return sb.toString();
    }
}