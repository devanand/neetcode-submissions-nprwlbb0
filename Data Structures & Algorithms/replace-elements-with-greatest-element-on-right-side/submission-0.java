class Solution {
    public int[] replaceElements(int[] arr) {
        int largest = -1;
        for (int right = arr.length - 1; right >= 0; right--) {
            int temp = arr[right];
            arr[right] = largest;
            largest = Math.max(largest, temp);
        }
        return arr;
    }
}