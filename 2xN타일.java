import java.util.Scanner;

public class Main {
    static int arr[]=new int[1001];
    static public int fibo(int N){
        if(N==1){
            return 1;
        }else if(N==2){
            return 2;
        }
        if(arr[N]!=0){return arr[N];}
        return arr[N]=(fibo(N-1)+fibo(N-2))%10007;
    }
    static public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int answer=fibo(N);
        System.out.println(answer);
    }
}
