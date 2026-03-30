class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] buffer = new int[amount + 1];
        Arrays.fill(buffer, amount + 1);
        buffer[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int coin: coins) {
                if (i - coin >= 0) {
                    buffer[i] = Math.min(buffer[i], buffer[i - coin] + 1);
                }
            }
        }

        return buffer[amount] > amount ? -1 : buffer[amount];
    }
}
