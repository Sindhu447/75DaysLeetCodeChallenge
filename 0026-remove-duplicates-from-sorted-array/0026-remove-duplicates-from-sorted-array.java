class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;
        
        int i = 0; // pointer for unique elements
        
        for (int j = 1; j < nums.length; j++) {
            
            // If new element found
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // place unique element
            }
        }
        
        return i + 1; // number of unique elements
    }
}