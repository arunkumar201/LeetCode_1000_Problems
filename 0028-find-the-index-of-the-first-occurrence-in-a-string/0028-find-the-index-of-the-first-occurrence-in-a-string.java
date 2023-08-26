class Solution {
    public int strStr(String h, String n) {
        int n1 = h.length();
        int n2 = n.length();
        
        if (n2 == 0) {
            return 0;
        }
        
        if (n2 > n1) {
            return -1;
        }
        
        if (h.equals(n)) {
            return 0;
        }
        
        for (int i = 0; i <=n1-n2; i++) {
            if (h.substring(i, i + n2).equals(n)) {
                return i;
            }
        }
        
        return -1;
    }
}