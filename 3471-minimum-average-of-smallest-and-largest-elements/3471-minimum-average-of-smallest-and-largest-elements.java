class Solution {
    public double minimumAverage(int[] nums) {
      PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            minPq.add(num);
            maxPq.add(num);
        }

        double minAverage = Double.MAX_VALUE;
        while (!minPq.isEmpty() && !maxPq.isEmpty()) {
            double average = (minPq.poll() + maxPq.poll()) / 2.0;
            minAverage = Math.min(minAverage, average);
        }

        return minAverage;
    }
}
       