class Solution {
    public static  boolean isAnagram(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2) return false;
        if(n1==1 && n2==1) {
            Character ch1=s1.charAt(0);
            Character ch2=s2.charAt(0);
            if(ch1.equals(ch2)) return true;
            else return false;
        }
        int lookup1[]=new int[26];
        for(int i=0;i<n1;i++) {
            lookup1[s1.charAt(i)-'a']++;
        }
           for(int i=0;i<n2;i++) {
            lookup1[s2.charAt(i) - 'a']--;
        }
           for(int c: lookup1) {
             if(c!=0)  return false;
        }
     
        return true;
    }
}