import java.util.*;

class Main {
    static int toX[]= {0,0,-1,1};
    static int toY[] = {1,-1,0,0};
    static int answer[];
    static int arr[][];
    static int count;
    static boolean chk[][];
    public static void dfs(int x, int y){
        chk[x][y]=true;

        for(int i=0;i<4;i++){
            int destX = x+toX[i];
            int destY = y+toY[i];
            if(destX>=0 && destY>=0 && destX<arr.length && destY<arr[0].length && !chk[destX][destY] && arr[destX][destY]== arr[x][y]){
                chk[destX][destY] = true;
                count++;
                dfs(destX,destY);
            }
        }
        answer[1] = Math.max(answer[1],count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        arr = new int[m][n];
        chk = new boolean[m][n];
        answer = new int[2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!chk[i][j] && arr[i][j]>0){
                    count=1;
                    answer[0]+=1;
                    dfs(i,j);

                }
            }
        }
        System.out.println(answer[0]+" "+answer[1]);

    }


//    1 1 1 0
//    1 2 2 0
//    1 0 0 1
//    0 0 0 1
//    0 0 0 3
//    0 0 0 3

}
