class Solution {
  static boolean isContain(int[] a, int target) {
        //Binary Search
        int l = 0;
        int h = a.length-1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == target) {
                return true;
            }
            if (a[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
 static int getAnswer(int []n1, int []n2){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i: n2){
            hs.add(i);
        }
        for(int j: n1){
            if(hs.contains(j)){
                return j;
            }
        }
        return -1;
    }
    public  static  int getCommon(int []n1, int []n2) {
        if(n1[0]==n2[0])  return n1[0];
        if(n1[0]>n2[0])  return getAnswer(n2, n1);
       else return getAnswer(n1, n2);
    }
}