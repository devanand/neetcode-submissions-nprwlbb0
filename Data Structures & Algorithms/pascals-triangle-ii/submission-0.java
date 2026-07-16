class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> output = new ArrayList<>(rowIndex);
        output.addFirst(1);
        for (int i = 1; i <= rowIndex; i++) {
            int prev = output.get(output.size() - 1);
            output.add((int)((long)prev * (rowIndex - i + 1)/i));
        }
        return output;
    }

    

}