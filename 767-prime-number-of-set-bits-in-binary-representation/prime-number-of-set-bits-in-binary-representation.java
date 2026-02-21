class Solution {
    public boolean isSmallPrime(int x){
        return (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19);
    }
    public int countPrimeSetBits(int left, int right) {
      int ans = 0;

      for(int i = left; i <= right; i++){
        if(isSmallPrime(Integer.bitCount(i))){
            ans++;
        }
      }  

      return ans;
    }
}