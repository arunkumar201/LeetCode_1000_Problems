class Solution {
     public  static String removeDigit(String sn, char digit) {
        //removing the given digit from the string
        int n = sn.length();
        // if (sn.charAt(0) == '1' && digit == '1' || (sn.charAt(0) < sn.charAt(1) && digit == sn.charAt(0))) {
        //     return sn.substring(1, sn.length());
        // }
        for (int i = 0; i < n-1; i++) {
            if (digit == sn.charAt(i) && sn.charAt(i+1)>digit) {
                return sn.substring(0,i)+sn.substring(i+1);
            }
        }
        for (int j =n-1; j>=0;j--) {
            if (digit == sn.charAt(j)) {
                return sn.substring(0,j)+sn.substring(j+1,sn.length());
            }
        }
        return null;
    }
}