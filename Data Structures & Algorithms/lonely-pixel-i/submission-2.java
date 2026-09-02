class Solution {
    public int findLonelyPixel(char[][] picture) {
        int len = picture.length;
        int rowLen = picture[0].length;
        int output = 0;
        int[] rowCount = new int[len];
        int[] colCount = new int[rowLen];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < rowLen; j++) {
                char p = picture[i][j];
                if (p == 'B') {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < rowLen; j++) {
                if (rowCount[i] == 1 && colCount[j] == 1 && picture[i][j] == 'B') {
                    output++;
                }
            }
        }
        return output;
    }
}
