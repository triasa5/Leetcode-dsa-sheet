class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        for i in range(0,n):
            nums1[m+i] = nums2[i] # copy elements of nums2 and paste into nums1
        nums1.sort() 
        
        
