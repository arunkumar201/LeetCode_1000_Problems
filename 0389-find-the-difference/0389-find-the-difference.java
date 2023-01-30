class Solution {
    public char findTheDifference(String s, String t) {
       int[] ch =new int[26];
        for(int i = 0; i < t.length(); i++){
           ch[t.charAt(i) - 'a']++;
            if(i<s.length())  ch[s.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]==1) return (char) (i + 'a');
        }
    return ' ';
}

}