class Solution {
    public static  int minDeletionSize(String[] str) {
        int n=str.length;
        int count=0;
        int z=str[0].length();
        for(int k=0;k<z;k++){
             char c1=str[0].charAt(k);
            for(int i=1;i<str.length;i++){
                char c2=str[i].charAt(k);
                if(c2<c1){
                    count++;
                    break;
                }
                c1=c2;
            }
            
        }
        return count;
    }
}