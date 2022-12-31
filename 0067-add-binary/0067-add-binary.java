class Solution {
    public static  String addBinary(String a, String b){
     int carry = 0;
    StringBuilder sb = new StringBuilder();
    for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0;i--,j--){
        int sum = carry + (i >= 0 ? a.charAt(i) - '0':0) + (j >= 0 ? b.charAt(j) - '0' : 0);
        sb.append(sum%2);
        carry =sum / 2;
    }
    if(carry > 0) sb.append(carry);
    sb.reverse();
    return sb.toString();
}
}