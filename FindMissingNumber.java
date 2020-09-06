class Solution {
    public int missingNumber(int[] nums) {
        int len =nums.length;
        int xor=0;
        for(int i=0;i<=len;i++)
            xor^=i;
        for(int i=0;i<len;i++)
        {
            xor^=nums[i];
        }
        
        return xor;
    }
}
