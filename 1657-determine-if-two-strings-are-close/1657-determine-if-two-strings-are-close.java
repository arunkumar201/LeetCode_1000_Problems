class Solution {
          public static boolean closeStrings(String w1, String w2) {
        if (w1 == null || w2 == null) {
            return false;
        }
        int n1 = w1.length();
        int n2 = w2.length();
        if (n1 != n2) return false;
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(char c:w1.toCharArray()){
            ch1[c-'a']++;
        }
        for(char c:w2.toCharArray()){
            ch2[c-'a']++;
        }
        //check the both string having same characters or not
        for(int i=0;i<26;i++) {
            if((ch1[i]==0 && ch2[i]!=0) || (ch1[i]!=0 &&ch2[i]==0)) {
                return false;
            }
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<26;i++) {
            if(ch1[i]!=ch2[i]) {
                return false;
            }
        }
    return true;
    }
}