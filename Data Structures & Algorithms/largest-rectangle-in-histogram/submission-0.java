class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>(); // increasing heights by index
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int currHeight = (i == heights.length) ? 0 : heights[i]; // sentinel to flush stack

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int mid = stack.pop();
                int height = heights[mid];

                int leftSmallerIndex = stack.isEmpty() ? -1 : stack.peek();
                int rightSmallerIndex = i;

                int width = rightSmallerIndex - leftSmallerIndex - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
