class Solution {
    public int minimumPushes(String word) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int assignKey = 2;
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            if (assignKey > 9) {
                assignKey = 2;
            }
            map.put(assignKey, map.getOrDefault(assignKey, 0) + 1);
            result += map.get(assignKey);
            assignKey++;
        }
        return result;
    }
}