class Solution {
    public int missingNumber(int[] arr) {
        int left = 0, right = arr.length - 1;
        int diff = (arr[right] - arr[0]) / arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == arr[0] + mid * diff) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr[0] + left * diff; 
    }

}
