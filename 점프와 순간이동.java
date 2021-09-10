import java.util.*;
class LinkedList{
    static public void main(String[] args){
        int n=5000;
        int temp=1;
        int middle=1;
        int answer=Integer.MAX_VALUE;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }else{
                temp++;
                n=n/2;
            }
        }
        System.out.println(temp);
    }
}