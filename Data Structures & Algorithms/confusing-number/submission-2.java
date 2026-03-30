class Solution {
    public boolean confusingNumber(int n) {
        boolean[] isValid = new boolean[10];
        for (int i = 0; i < isValid.length; i++) {
            if (i == 0 || i == 1 || i == 6 || i == 8 || i == 9) {
                isValid[i] = true;
            }
        }
        int quotient = n;
        int result = 0;
        while (quotient != 0) {
            int reminder = quotient % 10;
            quotient = quotient / 10;
            
            if (!isValid[reminder]) {
                return false;
            }
            result = (result * 10) + (reminder == 6 ? 9 : reminder == 9 ? 6 : reminder);
        }
        return result != n;
    }
}
