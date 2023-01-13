class Solution {
    public static  int countKDifference(int[] a, int k) {
       int n=a.length;
      
       if(n<2) return 0;
           int[] data = new int[101];
        for (int num : a) {
            data[num]++;
        }
        int count = 0;
        for (int i = 0; i + k < 101; i++) {
            count += data[i] * data[i + k];
        }
        return count;
        
    }
}