import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] toX = {0, -1, 0, 1};
    static int[] toY = {-1, 0, 1, 0};
    static int[][] box;
    static int N;
    static int M;
    static boolean[][] chk;
    static int days = Integer.MIN_VALUE;


    static public void bfs() {
        Queue<Point> q = new LinkedList<>();
        chk = new boolean[box.length][box[0].length];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    q.add(new Point(i, j));

                }
            }
        }
        while (!q.isEmpty()) {
            Point temp = q.poll();
            for (int i = 0; i < toX.length; i++) {
                int moveX = toX[i] + temp.x;
                int moveY = toY[i] + temp.y;
                if ((toX[i] + temp.x < 0 || toY[i] + temp.y < 0 || toX[i] + temp.x >= N || toY[i] + temp.y >= M)) {
                    continue;
                }

                if (box[moveX][moveY] != 0) {
                    continue;
                }
                box[moveX][moveY] = box[temp.x][temp.y] + 1;
                q.add(new Point(moveX, moveY));

            }

        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    //토마토가 모두 익지 못한 상황이라면 -1 을 출력한다.
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, box[i][j]);
            }
        }
        System.out.println(max - 1);
    }


    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M= sc.nextInt();
        N = sc.nextInt();
        box = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
            }
        }
        bfs();

    }
}
