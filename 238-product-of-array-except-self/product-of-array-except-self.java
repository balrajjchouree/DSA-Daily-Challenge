class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul = 1;
        int cnt = 0;

        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                cnt++;
            }
            else{
                mul = mul * nums[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                if(cnt == 0){
                    ans[i] = mul / nums[i];
                }
                else{
                    ans[i] = 0;
                }
            }
            else{
                if(cnt == 1){
                    ans[i] = mul;
                }
                else{
                    ans[i] = 0;
                }
            }
        }

        return ans;
    }
}