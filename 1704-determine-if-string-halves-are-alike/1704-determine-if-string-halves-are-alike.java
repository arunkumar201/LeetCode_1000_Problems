class Solution {
     private  static  boolean isVowels(char c) {
        char ch=Character.toUpperCase(c);  //or char ch=c-32;
        return (ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E');
    }
    public static boolean halvesAreAlike(String s){
        int n=s.length();
        int l=0;
        int h=n-1;
        int Vowels_Left =0;
        int Vowels_Right=0;
        while(l<h){
            if(isVowels(s.charAt(l))){
                Vowels_Left++;
            }
            if(isVowels(s.charAt(h))){
                Vowels_Right++;
            }
            l++;
            h--;
        }
        if(Vowels_Left==Vowels_Right) return true;
        return false;
    }
}