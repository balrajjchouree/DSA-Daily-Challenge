class Solution {
    private int maxValue(int[] piles){
        int n = piles.length;
        int max = Integer.MIN_VALUE;

        for(int num : piles){
            max = Math.max(max, num);
        }

        return max;
    }

    private long calculateTotalHrs(int[] piles, int speed){
        long totalHrs = 0;

        for(int bananas : piles){
            totalHrs += (int)Math.ceil((double)bananas / speed);
        }

        return totalHrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = maxValue(piles);

        int low = 1, high = max;
        int ans = max;

        while(low <= high){
            int mid = low + (high - low) / 2;

            long totalHrs = calculateTotalHrs(piles, mid);

            if(totalHrs <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}