class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int i = 0;
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();

        for(int x : nums){
            int c = count.getOrDefault(x, 0) + 1;
            count.put(x, c);

            if(c == 2){
                ans[i++] = x;
            }
        }
        return ans;
    }
}