package blind75;

import utils.InputDataReader;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int minVal = (height[left] < height[right]) ? height[left] : height[right];
            int area = (right - left) * minVal;
            if (max < area) {
                max = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] height = inputDataReader.readIntArr();

        System.out.println(maxArea(height));
    }
}
