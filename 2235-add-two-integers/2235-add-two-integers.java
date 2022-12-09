class Solution {
    public int sum(int x, int y) {
         if (y == 0)
               return x;
        return sum(x ^ y,(x & y) << 1);
    }
}