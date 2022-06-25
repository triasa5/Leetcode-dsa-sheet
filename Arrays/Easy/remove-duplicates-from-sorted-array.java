class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int loc = 0;
        int k = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev)
                k--;
            else
                nums[++loc] = nums[i];
                prev = nums[i];       
        }
        return k;
    }
}
