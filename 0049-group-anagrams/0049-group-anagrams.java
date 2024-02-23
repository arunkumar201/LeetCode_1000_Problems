class Solution {
    public static List<List<String>> groupAnagrams(String[] str) {
        // System.out.println(Arrays.toString(str));
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            int[] countArr = new int[26];
            for (int j = 0; j < s.length(); j++) {
                countArr[s.charAt(j) - 'a']++;
            }
            // System.out.println(Arrays.toString(countArr));
            String countStr = Arrays.toString(countArr);
            if (map.containsKey(countStr)) {
                map.get(countStr).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(countStr, list);
            }
        }
        // System.out.println(map);
        return new ArrayList<>(map.values());
    }
}