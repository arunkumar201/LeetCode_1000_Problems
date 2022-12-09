class Solution {
  public static String defangIPaddr(String add) {
         int n=add.length();
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(j<n) {
            if(add.charAt(j)!='.') {
                j++;
            }
            else {
                ans.append(add.substring(i, j));
                if(j!=n) ans.append("[.]");
                i=j+1;
                j=i;
            }
        }
       ans.append(add.substring(i,n));
     return ans.toString();
    }
}