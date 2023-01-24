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

  public static int getCommon(int[] n1, int[] n2) {
        int res=Integer.MAX_VALUE;
        for (int i : n1) {
            if (isContain(n2, i)) {
                res=Math.min(res,i);
            }
        }
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }
}