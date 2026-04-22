class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int index = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
}