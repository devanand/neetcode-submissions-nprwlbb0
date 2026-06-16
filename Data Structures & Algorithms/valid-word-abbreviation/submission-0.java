class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int actualLength = word.length(), abbrLength = abbr.length();
        int i = 0, j = 0;
        while (i < actualLength && j < abbrLength) {
            if (abbr.charAt(j) == '0') {
                return false;
            }
            if (Character.isLetter(abbr.charAt(j))) {
                if (i < actualLength && word.charAt(i) == abbr.charAt(j)) {
                    i++;
                    j++;
                } else {
                    return false;
                }
            } else {
                int subLen = 0;
                while (j < abbrLength && Character.isDigit(abbr.charAt(j))) {
                    subLen = subLen * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += subLen;
            }

        }
        return i == actualLength && j == abbrLength;
    }
}