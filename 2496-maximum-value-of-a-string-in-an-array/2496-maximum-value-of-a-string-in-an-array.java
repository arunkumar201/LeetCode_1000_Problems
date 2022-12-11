class Solution {
    public static boolean onlyDigits(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    public static  int maximumValue(String[] s) {
      int n=s.length;
      if(n==0) return 0;
      int max=Integer.MIN_VALUE;
      for(String i:s) {
          int slen=0;
        if(!onlyDigits(i))  slen=i.length();
          int len=0;
          if(onlyDigits(i)){
              len=Integer.parseInt(i);
          }
          max=Math.max(max,slen);
          max=Math.max(max,len);
      }
return max;
    }
}