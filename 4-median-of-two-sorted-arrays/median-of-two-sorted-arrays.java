class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        for(int num : nums1){
            merged.add(num);
        }
        for(int num : nums2){
            merged.add(num);
        }

        Collections.sort(merged);

        int totalSize = merged.size();
        double median;

        if(totalSize % 2 == 0){
            median = (merged.get(totalSize / 2) + merged.get(totalSize / 2 - 1)) / 2.0;
        }
        else{
            median = merged.get(totalSize / 2);
        }

        return median;
    }
}