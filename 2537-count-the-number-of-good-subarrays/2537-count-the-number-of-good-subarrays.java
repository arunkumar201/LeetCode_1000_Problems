class Solution {
    public long countGood(int[] nums, int k) {
        long res = 0;
        long val = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int first = 0;
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(nums[i])) {
                val += mp.get(nums[i]);
            }
            mp.put(nums[i], 1 + mp.getOrDefault(nums[i], 0));
            while (val >= k) {
                res += n - i;
                int cn = mp.getOrDefault(nums[first], 0);
                val -= cn - 1;
                if (cn == 1) {
                    mp.remove(nums[first]);
                } else {
                    mp.put(nums[first], cn - 1);
                }
                first++;
            }
        }
        return res;
    }
}