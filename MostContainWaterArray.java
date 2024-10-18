// there output 36 code given but actual output is 49 check error

class Solution {
    public static int maxArea(int[] height) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length]; 

        leftMax[0] = 0;
        rightMax[height.length - 1] = 0;

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }

        int width[] = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            width[i] = Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        int newHeight[] = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            newHeight[i] = Math.max(0, Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            maxWater = Math.max(maxWater, newHeight[i] * width[i]);
        }

        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
