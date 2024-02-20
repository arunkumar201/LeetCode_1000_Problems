class Solution {
      public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        arr[n - 1] = -1;
        for (int j = n - 2; j >= 0; j--) {
            int temp = arr[j];
            arr[j] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}