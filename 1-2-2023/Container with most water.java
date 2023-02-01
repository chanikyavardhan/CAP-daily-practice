class Solution {
    public int maxArea(int[] height) {
        int maxi = 0;
        int left = 0;
        int right = height.length-1;
        while(left<=right){
            maxi = Math.max(Math.min(height[left],height[right])*(right-left),maxi);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}
