class Solution {
    public String stringShift(String s, int[][] shift) {
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 1) {
                s = shiftRight(s, shift[i][1]);
            } else {
                s = shiftLeft(s, shift[i][1]);
            }
        }
        return s;
    }

    private String shiftRight(String s, int times) {
        if (s == null || s.length() == 0) return s;
        int n = s.length();
        times = times % n;
        if (times == 0) return s;
        String rightPart = s.substring(n - times);
        String leftPart = s.substring(0, n - times);
        return rightPart + leftPart;
    }

    private String shiftLeft(String s, int times) {

        if (s == null || s.length() == 0) return s;
        int n = s.length();
        times = times % n;
        if (times == 0) return s;
        String leftPart = s.substring(0, times);    
        String rightPart = s.substring(times);
        return rightPart + leftPart;
    }
}
