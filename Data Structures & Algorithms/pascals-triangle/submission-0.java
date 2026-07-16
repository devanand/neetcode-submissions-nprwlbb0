class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer>firstRow = new ArrayList<>();
        firstRow.add(1);
        output.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = output.get(i - 1);
            List<Integer> row = new ArrayList<>(i);
            row.addFirst(1);
            row.addLast(1);
            for (int j = 1; j < i; j++) {
                row.add(j, prevRow.get(j) + prevRow.get(j-1));
            }
            output.add(row);
        }
        return output;
    }
    
}