import java.math.*;
class Solution {
     public  static String removeDigit(String sn, char digit) {
        //removing the given digit from the string
        int n = sn.length();
         BigInteger ans = new BigInteger("0");
           for(int i=0;i<n;i++){
            if(sn.charAt(i)==digit){
                BigInteger bs=new BigInteger(sn.substring(0,i)+sn.substring(i+1));
                ans=ans.max(bs);
                  }
         }

        return ans.toString();
    }
}