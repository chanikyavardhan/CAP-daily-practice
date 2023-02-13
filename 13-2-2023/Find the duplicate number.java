class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                j = nums[i];
            }
        }
        return j;
    }
}
