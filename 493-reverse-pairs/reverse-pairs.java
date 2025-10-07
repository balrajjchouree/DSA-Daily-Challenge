class Solution {
    private static void merge(int[] nums, int low, int mid, int high){
        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= high){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = nums[i++];
        };

        while(j <= high){
            temp[k++] = nums[j++];
        }

        for(k = 0, i = low; k < temp.length; k++, i++){
            nums[i] = temp[k];
        }
    }

    private static int countPairs(int nums[], int low, int mid, int high){
        int right = mid + 1;
        int count = 0;

        for(int i = low; i <= mid; i++){
            while(right <= high && (long) nums[i] >  2L * nums[right]){
                right++;
            }
            count += (right - (mid + 1));
        }

        return count;
    }

    private static int mergeSort(int[] nums, int low, int high){
        int count = 0;

        if(low >= high){
            return count; 
        }

        int mid = low + (high - low) / 2;
        
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);

        count += countPairs(nums, low, mid, high);

        merge(nums, low, mid, high);

        return count;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
    
        return mergeSort(nums, 0, n - 1);
    }
}