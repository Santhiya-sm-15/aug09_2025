class Solution {
    public boolean isPowerOfTwo(int n) {
        long x=1;
        while(x<(long)n)
            x*=2;
        return x==n;
    }
}