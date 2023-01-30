class Solution {
    public char findTheDifference(String s, String t) {
       char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
    Arrays.sort(sChars);
    Arrays.sort(tChars);
    for (int i = 0; i < t.length(); i++) {
        if (i < s.length() && sChars[i] != tChars[i]) return tChars[i];
        if (i == s.length()) return tChars[i];
    }
    return ' ';
}

}