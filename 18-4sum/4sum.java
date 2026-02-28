class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i < n - 3; i++){
            for(int j = i + 1; j < n - 2; j++){
                long value = (long)target - nums[i] - nums[j];
                int low = j + 1, high = n - 1;

                while(low < high){
                    int sum = nums[low] + nums[high];

                    if(sum == value){
                        set.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        high--;
                    }
                    else if(sum < value){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}