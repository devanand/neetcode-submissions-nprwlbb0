class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        dp[0] = s.charAt(0) == '0' ? 0 : 1;;
        

        for (int i = 1; i < n; i++) {
            int oneDigit = s.charAt(i) - '0';
            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += (i >= 2 ? dp[i - 2] : 1);  
            }
        }
        return dp[n - 1];
    }
}
