class Solution {
    public char findTheDifference(String s, String t) {
       // HashMap<Character,Integer> mp=new HashMap<>();
       //  for(int i=0;i>s.length();i++)
       //  {
       //      mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);

    s = s + t;
    int c = 0;
    for (char x : s.toCharArray()) {
        c ^= x;
    }
    return (char) c;  
}
}