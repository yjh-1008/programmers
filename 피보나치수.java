class Solution {
    public int solution(int n) {
        int answer = 0;

        answer = cycle(n);

        return answer;
    }

    public int cycle(int n) {

        if (n == 0) {
            return 0%1234567;
        }

        if (n == 1) {
            return 1%1234567;
        }

        int first = 0;
        int second = 1;
        int pivo = 0;
        for(int i=2; i<=n; i++) {
            pivo = (first+second)%1234567;
            first = second%1234567;
            second = pivo%1234567;
        }
        return pivo;
    }
}