class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        int ans = k;

        for(int i = 0; i < n; i++){
            if(arr[i] <= ans){
                ans++;
            }
            else{
                break;
            }
        }
        return ans;
    }
}