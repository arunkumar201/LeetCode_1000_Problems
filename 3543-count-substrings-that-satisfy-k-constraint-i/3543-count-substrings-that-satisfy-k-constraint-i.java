class Solution {
    public boolean isValidString(String s, int k) {
        int count_0 = 0;
        int count_1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count_0++;
            } else {
                count_1++;
            }
        }
        return count_1 <= k || count_0 <= k;
    }

    public int countKConstraintSubstrings1(String s, int k) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isValidString(s.substring(i, j), k)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    // optimze solution
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count_0 = 0;
            int count_1 = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') {
                    count_0++;
                } else {
                    count_1++;
                }
                if (count_1 <= k || count_0 <= k) {
                    ans++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}
