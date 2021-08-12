import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.PriorityQueue;

public class LinkedList {
    static public void main(String[] args){
        int[] arr={1,1,2,6};
        int k=1;
        int answer=0;
        PriorityQueue<Integer> arr1=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            arr1.add(arr[i]);
        }
        int temp=0;
        while(true){
            if(arr1.size()<=1 && arr1.peek()<k){
                answer=-1;
                break;
            }
            if(arr1.peek()>=k){
                break;
            }
            temp=arr1.poll()+arr1.poll()*2;
            arr1.add(temp);
            answer++;
        }
        System.out.println(answer);
    }
}
