class Solution {
    public static String decodeMessage(String key, String message) {
        int len = key.length();
        String res="";
        HashMap<Character, Character> mp = new HashMap<>();
        char start='a';
        for (int i=0;i<len;i++) {
            if(!mp.containsKey(key.charAt(i)) && key.charAt(i) !=' ') {
                mp.put(key.charAt(i),start++);
            }
        }
        for(int i=0;i<message.length();i++) {
            if(message.charAt(i)==' '){
                res+=' ';
            }
            else if(mp.containsKey(message.charAt(i))) {
                res+=mp.get(message.charAt(i));
            }
        }
        return res;
    }
}