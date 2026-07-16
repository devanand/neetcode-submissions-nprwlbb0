class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        // int gain = 0;
        // for (int i = 0; i < minutes; i++) {
        //     if (grumpy[i] == 1) {
        //         gain += customers[i];
        //     }
        // }

        int maxGain = 0, gain = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                gain += customers[i];
            }
            if (i >= minutes && grumpy[i - minutes] == 1) {
                gain -= customers[i - minutes];
            }
            if (gain > maxGain) {
                maxGain = gain;
            }
        }
        
        return satisfied + maxGain;
    }
}