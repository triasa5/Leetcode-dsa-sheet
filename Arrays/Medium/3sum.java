/**
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:

Input: nums = []
Output: []

Example 3:

Input: nums = [0]
Output: []
 
Constraints:

0 <= nums.length <= 3000
-10^5 <= nums[i] <= 10^5
**/

// Time complexity: O(nlogn)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums); // O(log n) 
      List <List<Integer>> result = new ArrayList<>();
      for(int i = 0; i < nums.length; i++) {
        // If the current value is the same as the prev one, then continue.
        if (i > 0 && nums[i] == nums[i - 1]) 
           continue;
        int left = i + 1;
        int right = nums.length - 1;
        while(left < right) {
          int treeSum = nums[i] + nums[left] + nums[right];
          if(treeSum > 0) 
            right -= 1;
          else if (treeSum < 0) 
            left += 1;
          else {
            result.add(Arrays.asList(nums[i], nums[left], nums[right]));
            left += 1;
            while(nums[left] == nums[left -1] && left < right)
              left += 1;
          }
        }
      }
      return result;
   }
}
