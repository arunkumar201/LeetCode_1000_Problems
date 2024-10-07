class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while (i < sb.length() - 1) {
            if (sb.substring(i, i + 2).equals("AB") || sb.substring(i, i + 2).equals("CD")) {
                sb.delete(i, i + 2);
                i = Math.max(0, i - 1);
            } else {
                i++;
            }
        }

        return sb.length();
    }
}