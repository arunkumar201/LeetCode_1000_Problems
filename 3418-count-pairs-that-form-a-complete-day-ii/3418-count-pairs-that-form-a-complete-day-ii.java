class Solution {
         public long countCompleteDayPairs(int[] hours) {
        int n = hours.length;
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int hour : hours) {
            int rem = hour % 24;
            int compliment = (24 - rem) % 24;
            if (map.containsKey(compliment)) {
                count += map.get(compliment);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }  
}