class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] res = new char[s.length()];
        int countOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countOnes++;
            }
            res[i] = '0';
        }
        res[s.length() - 1] = '1';
        countOnes--;
        for (int i = 0; i < countOnes; i++) {
            res[i] = '1';
        }
        return String.valueOf(res);
    }
}