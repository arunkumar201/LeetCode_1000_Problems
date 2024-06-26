class Solution {
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int prevPrev = 0;
        int prev = 1;
        int curr = 1;

        for (int i = 3; i <= n; i++) {
            int next = prevPrev + prev + curr;
            prevPrev = prev;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}