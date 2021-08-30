class Solution {
    public boolean isPerfectSquare(long n) {
        if ((long) (Math.sqrt(n)) * (long) (Math.sqrt(n)) == n)
            return true;
        return false;
    }

    public boolean judgeSquareSum(int c) {
        long num = (long) (c);
        for (long i = 0; i * i <= c; i++) {
            long left = num - (i * i);
            if (isPerfectSquare(left))
                return true;
        }
        return false;
    }
}