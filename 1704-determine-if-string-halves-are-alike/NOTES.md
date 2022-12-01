​***Approach :1 Using HashSet and Two pointer Technique
TC=O(N) and SC=O(N)***

**1.  Create a HashSet And Put all Vowels (lowercase and Uppercase) 
2. Declare two Pointer low and High
And Initialize with
l=0
h=n-1 where n=length of the String
(In the Question the length of the String must be Even Length)
And Initialize the count Vowels_Left halve and count Vowels_Right half
3. Increment low and decrement high and just ensure that the current character is vowel or not via using HashSet Until l<h
at the end just comparing the count
Source Code: 

    public static boolean halvesAreAlike(String s) {
        //Simple and Easy Approach to solve this problem,
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
***Method-2 Without Using HashSet
Two Pointers Approach
TC=O(N) AND SC=O(1)***

Here Instead of Using HashSet,we are using a LookUp function
That returns true if a current character is Vowel else it returns false
The rest of the code is the Same as before.

Source Code: 
```
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
    } ```
Edit:
**  Most Optimal Solution**
we can runs the loop  exactly n/2 times and also fine
TC=O(N/2)
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

