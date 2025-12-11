class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){

            int[] freq = new int[26];;
            for(int j = i; j < s.length(); j++){
                freq[s.charAt(j) - 'a']++;

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int k : freq){
                    if(k > 0){
                        max = Math.max(k, max);
                        min = Math.min(k, min);
                    }
                }

                sum +=  (max - min);

            }
        }
        return sum;
    }
}