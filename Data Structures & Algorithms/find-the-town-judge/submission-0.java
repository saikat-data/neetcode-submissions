class Solution {
    public int findJudge(int n, int[][] trust) {


         int[] trustCount = new int[n + 1];

        for (int[] t : trust) {
            int person = t[0];
            int judge = t[1];

            trustCount[person]--; // person trusts someone
            trustCount[judge]++;  // someone trusts judge
        }

        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }

        return -1;
        
        
    }
}