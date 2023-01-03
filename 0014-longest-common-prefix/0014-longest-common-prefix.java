 class Solution{
public String longestCommonPrefix(String[] strs) {
        //This is a String array
        if (strs == null || strs.length == 0) return "";
       String res="";
    for(int i=0;i<strs[0].length();i++){ 
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length() ||strs[0].charAt(i) != strs[j].charAt(i)){   
              return strs[0].substring(0,i);
            }
            
        }
    }
   return strs[0];
       
    }
}