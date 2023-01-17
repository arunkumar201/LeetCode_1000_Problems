class Solution {
    public int minFlipsMonoIncr(String s) {
        int max=0;
        int zeros=0;
        int change=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeros++;
                change++;
                max=Math.max(max,change);
            }else{
                change--;
            }
        }
        return zeros-max;
    }
}