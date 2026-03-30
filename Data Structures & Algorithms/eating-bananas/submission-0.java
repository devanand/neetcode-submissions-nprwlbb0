class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxEatingRate = 0;
        for (int pile : piles) {
            maxEatingRate = Math.max(maxEatingRate, pile);
        }
        int minEatingRate = 1;
        for (; minEatingRate < maxEatingRate;) {
            int mid = minEatingRate + (maxEatingRate - minEatingRate) / 2;
            int hours = calculateHours(piles, mid);
            if (hours > h) {
                minEatingRate = mid + 1;
            } 
            if (hours <= h) {
                maxEatingRate = mid;
            }
        }
        return minEatingRate;
    }

    private int calculateHours(int[] piles, int rate) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile / rate);
            hours += ((pile % rate) > 0 ? 1 : 0);
        }
        return hours;
    }
}
