class Solution {
    public int leftSum(int[] nums, int index) {
        int total = 0;
        for (int i = 0; i < index; i++) 
            total += nums[i];
        return total;
    }
    public int rightSum(int[] nums, int index) {
        int total = 0;
        for (int i = index + 1; i < nums.length; i++) 
            total += nums[i];
        return total;
    }
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum(nums,i) == rightSum(nums,i)) {
                pivot = i;
                break;
            }
        }
        return pivot;
    }
}
