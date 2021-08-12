class Solution {
    public boolean solution(int arr) {
        boolean answer = false;
        String arr1=Integer.toString(arr);
        String[] arr2=arr1.split("");
        int sum=0;
        for(int i=0;i< arr2.length;i++){
            sum+=Integer.parseInt(arr2[i]);
        }
        System.out.print(arr+" "+sum);
        if(arr%sum==0){
            answer=true;
        }
        return answer;
    }
}