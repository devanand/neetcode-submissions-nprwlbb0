class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        for (int i=0, j = numbers.length -1; i<j;) {
            int a = numbers[i];
            int b = numbers[j];
            int sum = a + b;
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                output[0] = i+1;
                output[1] = j+1;
                return output;
            }
        }
        return output;
    }

}
