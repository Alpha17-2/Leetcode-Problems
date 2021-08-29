class Solution {
    public int minimumDifference(int[] a, int k) {
        Arrays.sort(a);
        int n = a.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            ans = Math.min(a[i + k - 1] - a[i], ans);
        }
        return ans;
    }
}