class Solution {
    long modulo = 1000000007;

    private long findPower(long a, long pow){
        if(pow == 0){
            return 1;
        }

        long half = findPower(a, pow / 2);
        long result = (half * half) % modulo;

        if(pow % 2 == 1){
            result = (result * a) % modulo;
        }

        return result;
    } 

    public int countGoodNumbers(long n) {
    return (int)(findPower(5, (n + 1) / 2) * findPower(4, n / 2) % modulo);
}
}