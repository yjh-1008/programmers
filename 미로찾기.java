import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] toX = { -1, 0, 1, 0 };
    static int[] toY = { 0, -1, 0, 1 };
    static class Point{
        private int x;
        private int y;
        Point(int x, int y){
            this.x =x;
            this.y= y;
        }
    }
    static boolean[][] chk;
    static int answer=1;
    static public void bfs(int[][] bfs_array){
        chk=new boolean[bfs_array.length+1][bfs_array[0].length+1];
        Queue<Point> q= new LinkedList<>();
        q.add(new Point(1,1));
        while(!q.isEmpty()){
            Point temp=q.poll();
            for(int i=0;i<toX.length;i++){

                if(temp.x+toX[i]>=1 &&temp.x+toX[i]<bfs_array.length&& temp.y+toY[i]>=1
                        && temp.y+toY[i]<bfs_array[0].length){
                    int moveX=temp.x+toX[i];
                    int moveY=temp.y+toY[i];
                    if(bfs_array[moveX][moveY]==1 && !chk[moveX][moveY]){
                        q.add(new Point(moveX,moveY));
                        chk[moveX][moveY]=true;
                        bfs_array[moveX][moveY]=bfs_array[temp.x][temp.y]+1;
                        answer++;
                    }
                }
            }
        }
    }
    static public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] bfs_array= new int[row+1][col+1];

        for(int i=1;i<row+1;i++){
            String str= sc.next();
            for(int j=1;j<col+1;j++){
                bfs_array[i][j]=str.charAt(j-1)-'0';
            }
        }
        bfs(bfs_array);
        System.out.println(bfs_array[row][col]);
    }
}
