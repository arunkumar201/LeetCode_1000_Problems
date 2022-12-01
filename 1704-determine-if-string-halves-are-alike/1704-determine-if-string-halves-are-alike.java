class Solution {
    public static boolean halvesAreAlike(String s) {
        //SImple and Easy Approach to solve this problem,
        int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        int i=0;
        hs.add('a');
        hs.add('A');
        hs.add('I');
        hs.add('i');
        hs.add('o');
        hs.add('O');
        hs.add('U');
        hs.add('u');
        hs.add('e');
        hs.add('E');

        int l=0;
        int h=n-1;
        int Vowels_Left =0;
        int Vowels_Right=0;
        while(l<h){
           if(hs.contains(s.charAt(l))){
               Vowels_Left++;
           }
           if(hs.contains(s.charAt(h))){
               Vowels_Right++;
           }
           l++;
           h--;
        }
        if(Vowels_Left==Vowels_Right) return true;
        return false;
    }
}