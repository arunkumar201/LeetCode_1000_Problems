class Solution {
   public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        int[] modifyFlower = new int[size + 2];
        for (int j = 1; j < modifyFlower.length - 1; j++) {
            modifyFlower[j] = flowerbed[j - 1];
        }

        for (int i = 1; i < modifyFlower.length-1; i++) {
            if (modifyFlower[i] == 0 && modifyFlower[i + 1] == 0 && modifyFlower[i - 1] == 0) {
                n--;
                modifyFlower[i] = 1;
            }
        }
        return n <= 0;
    }
}