class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        for i in range(0,n):
            nums1[m+i] = nums2[i] # copy elements of nums2 and paste into nums1
        nums1.sort() 
    
# more efficient 
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        check1 = m-1 # pointer for nums1 array
        check2 = n-1 # pointer for nums2 array
        pointer = m+n-1 # pointer for last element of nums1
        while check1>=0 and check2>=0:
            if nums1[check1] <= nums2[check2]:
                nums1[pointer] = nums2[check2]
                check2 -= 1
            else:
                nums1[pointer] = nums1[check1]
                check1 -= 1
            pointer -= 1
        
        if check2>=0: # if there is elements left in nums2
            nums1[:check2+1] = nums2[:check2+1] # just copy them as they are already sorted
        return 
        
        
        
        
