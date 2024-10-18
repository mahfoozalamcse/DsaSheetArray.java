public class MostContainTwoPointer {
    
        public static int maxArea(int[] height) {
         
            int left = 0;
            int right = height.length - 1;
            int maxWater = 0;
    
            while (left < right) {
                
                int width = right - left;
                
                
                int currentWater = Math.min(height[left], height[right]) * width;
    
                
                maxWater = Math.max(maxWater, currentWater);
    
                
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
    
            return maxWater;
        }
    
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
