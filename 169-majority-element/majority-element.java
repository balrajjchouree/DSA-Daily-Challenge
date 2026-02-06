class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = -1;

        for(int i = 0; i < n; i++){
            int count = 1;

            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > n / 2){
                majority = nums[i];
            }
        }

        return majority;
    }
}