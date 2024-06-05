class Solution {

    public int minSteps(String s, String t) {
        int[] charCounts = new int[26];

        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charCounts[c - 'a']--;
        }

        int ans = 0;
        for (int count : charCounts) {
            if (count > 0) {
                ans += count;
            }
        }
        return ans;
    }
}