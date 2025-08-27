class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }

        n = n / 2;
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n){
                return entry.getKey();
            }
        }

        return 0;
    }
}