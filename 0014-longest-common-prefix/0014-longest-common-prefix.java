 class Solution{
public String longestCommonPrefix(String[] strs) {
        //This is a String array
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length - 1].toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                sb.append(a[i]);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}