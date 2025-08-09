# aug09_2025
The problem that i solved today in leetcode

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Code:
class Solution {
    public boolean isPowerOfTwo(int n) {
        long x=1;
        while(x<(long)n)
            x*=2;
        return x==n;
    }
}
