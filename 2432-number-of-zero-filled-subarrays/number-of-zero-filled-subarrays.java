class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0, subarraysCount = 0;

        for(int num : nums){
            if(num == 0)
                subarraysCount++;
            else
                subarraysCount = 0;

            ans += subarraysCount;
        }

        return ans;
    }
}