class Solution {

    // _BruteForce
    public int minDays_BruteForce(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (n < m * k) {
            return -1;
        }
        int maxDay = 0;

        int minDay = Integer.MAX_VALUE;
        // calculate the max Day from the bloomDay
        for (int day : bloomDay) {
            maxDay = Math.max(maxDay, day);
            minDay = Math.min(minDay, day);
        }

        for (int day = minDay; day <= maxDay; day++) {
            int bouquets = 0;
            int flowers = 0;
            for (int j = 0; j < n; j++) {
                if (bloomDay[j] <= day) {
                    flowers++;
                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    flowers = 0;
                }
            }
            if (bouquets >= m) {
                return day;
            }
        }
        return -1;
    }

    // Optimal
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        // if we have less numb of flowers then require ,return -1;
        if (n < m * k) {
            return -1;
        }
        int maxDay = 0;

        int minDay = Integer.MAX_VALUE;
        // calculate the max Day from the bloomDay
        for (int day : bloomDay) {
            maxDay = Math.max(maxDay, day);
            minDay = Math.min(minDay, day);
        }

        int left = minDay;
        int right = maxDay;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int bouquets = 0;
            int flowers = 0;
            for (int j = 0; j < n; j++) {
                if (bloomDay[j] <= mid) {
                    flowers++;
                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    flowers = 0;
                }
            }
            if (bouquets >= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left > maxDay) {
            return -1;
        }
        return left;
    }
}