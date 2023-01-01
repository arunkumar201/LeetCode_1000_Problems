class Solution {
     public static  boolean wordPattern(String p, String s) {
          int n=p.length();
        String []words=s.split(" ");
        if(n!= words.length)  return false;
        HashMap<Character,String> mp=new HashMap<Character,String>();
        for(int i=0;i<n;i++) {
            if(!mp.containsKey(p.charAt(i))){
                
                if(mp.containsValue(words[i]))
                    return false;
                mp.put(p.charAt(i),words[i]);
            }
           else if(!mp.get(p.charAt(i)).equals(words[i])){
               return false;
            }
        }
        return true;
    }
}