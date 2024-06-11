class Solution {
    public int[] relativeSortArray_1(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        int n1 = arr1.length;
        int[] ans = new int[n1];
        for (int j : arr1) {
            count[j]++;
        }
        int k = 0;
        for (int num : arr2) {
            if (count[num] > 0) {
                while (count[num] > 0) {
                    ans[k++] = num;
                    count[num]--;
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ans[k++] = i;
                count[i]--;
            }
        }
        return ans;
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int n1 = arr1.length;
        int[] ans = new int[n1];

        for (int j : arr1) {
            mp.put(j, mp.getOrDefault(j, 0) + 1);
        }

        int k = 0;

        for (int num : arr2) {
            int count = mp.get(num);
            while (count > 0) {
                ans[k++] = num;
                count--;
            }
            mp.remove(num);
        }

        int[] rest = new int[n1 - k];
        int i = 0;

        for (int key : mp.keySet()) {
            int count = mp.get(key);
            while (count > 0) {
                rest[i++] = key;
                count--;
            }
        }

        Arrays.sort(rest);

        for (int j : rest) {
            ans[k++] = j;
        }

        return ans;
    }
}