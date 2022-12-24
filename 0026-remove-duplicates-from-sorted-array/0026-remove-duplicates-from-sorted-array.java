class Solution {
    public int removeDuplicates(int[] arr) {
    int n=arr.length;
        if(n==1){
            return 1;
        }   
    Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
		}
}