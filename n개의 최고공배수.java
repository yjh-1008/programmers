import java.util.PriorityQueue;
class Solution {
    public int solution(int[] arr) {
        PriorityQueue<Long> arr1=new PriorityQueue<Long>();
        for(int i=0;i<arr.length;i++){
            arr1.add(Integer.toUnsignedLong(arr[i]));
        }
        while(true){
            if(arr1.size()==1){
                break;
            }
            long a=arr1.poll();
            long b=arr1.poll();
            int gcf=0;
            if(b%a==0){
                arr1.add(b);
            }else {
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        gcf = i;
                    }
                }
                arr1.add((a*b)/gcf);
            }
        }
        return Math.toIntExact(arr1.poll());
    }
}