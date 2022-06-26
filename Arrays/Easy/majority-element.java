/**
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
Constraints:

n == nums.length
1 <= n <= 5 * 10^4
-10^9 <= nums[i] <= 10^9
**/

// Time complexity: O(n)
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
