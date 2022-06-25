class Solution {
    public int count(int[] nums, int element) { 
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element)
                x++;
        }
        return x;
    }
    
    public int majorityElement(int[] nums) {
        int current_count;
        int max_count = 0;
        int max_num = 0;
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {   
            if (!hashset.contains(nums[i]))
                hashset.add(nums[i]);
        }
        for (int element : hashset) {
            current_count = count(nums, element);
            if (current_count > max_count && current_count > nums.length / 2) {
                max_count = current_count;
                max_num = element;
            }
        }
        return max_num;
    }
}
