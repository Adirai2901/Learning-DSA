public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, minHeight * width);

            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
