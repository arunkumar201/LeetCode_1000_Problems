class Solution {
    public int strStr(String h, String n) {
        int index = h.indexOf(n);
        return index != -1 ? index : -1;
    }
}