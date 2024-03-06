class Solution {
       public int minimumLength(String s) {
        int n = s.length();
        if (n == 1) {
            return 1;
        }
        int left = 0;
        int right = n - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char currentChar = s.charAt(left);
            while (left < right && s.charAt(left) == currentChar) {
                left++;
            }
            while (left <= right && (s.charAt(right) == currentChar)) {
                right--;
            }
        }
        if (left > right) {
            return 0;
        }
        if(left==right) return 1;
        return right - left + 1;
    }
}