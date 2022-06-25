class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1; // pointer for nums1
        int n2 = n - 1; // pointer for nums2
        int last = m + n - 1; // pointer for last position of nums1
        while (n1 >= 0 && n2 >= 0) {
            if (nums1[n1] <= nums2[n2]) {    // compare the elements of nums1 and nums2 and store the greater element at the end of nums1 
                nums1[last] = nums2[n2];
                n2--;
            }
            else {
                nums1[last] = nums1[n1];
                n1--;
            }
            last--;
        }
        while (n1 >= 0) {   // if there's no element left in nums2, simply copy the remaining elements of nums1 in nums1
            nums1[last] = nums1[n1];
            last--;
            n1--;
        }
        while (n2 >= 0) {   // if there's no element left in nums1, we simply copy the remaining elements of nums2 in num1
            nums1[last] = nums2[n2];
            last--;
            n2--;
        }
    }
}
