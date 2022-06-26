/**
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
Constraints:

1 <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
nums is sorted in non-decreasing order.
**/

// Time complexity: O(n)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, idx = nums.length - 1;
        int[] res = new int[nums.length];
        while (i <= j) {
            int isq = nums[i] * nums[i];
            int jsq = nums[j] * nums[j];
            if(isq > jsq) {
                res[idx] = isq;
                i++;
            }
            else {
                res[idx] = jsq;
                j--;
            }
            idx--;
        }
        return res;
    }
}

// Time complexity: O(nlogn)
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
