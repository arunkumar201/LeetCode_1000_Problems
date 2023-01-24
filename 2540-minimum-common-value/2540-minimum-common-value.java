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
  public  static  int getCommon(int []n1, int []n2) {
        int j = 0;
        int i = 0;
        while (i < n1.length && j < n2.length) {
            if (n1[i] == n2[j]) return n1[i];
            if (n1[i] > n2[j]) j++;
            else i++;
        }
        return -1;
    }
}