class Solution {
     private  static  boolean isVowels(char c) {
        char ch=Character.toUpperCase(c);  //or char ch=c-32;
        return (ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E');
    }
    public static boolean halvesAreAlike(String s){
        int n=s.length();
        int l=0;
        int Vowels_Left =0;
        int Vowels_Right=0;
       for(int i=0;i<n/2;i++){
            if(isVowels(s.charAt(i))){
                Vowels_Left++;
            }
            if(isVowels(s.charAt(n-1-i))){
                Vowels_Right++;
            }
           
        }
        if(Vowels_Left==Vowels_Right) return true;
        return false;
    }
}