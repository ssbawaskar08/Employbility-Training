public class HWQ17 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 8, 21, 7},
            {19, 17, 10, 20},
            {2, 18, 23, 22},
            {14, 25, 4, 11}
        };

        int n = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n][m];

        dp[0][0] = arr[0][0];

        for (int i = 1; i < n; i++)
            dp[i][0] = Math.max(dp[i - 1][0], arr[i][0]);

        for (int j = 1; j < m; j++)
            dp[0][j] = Math.max(dp[0][j - 1], arr[0][j]);

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int fromTop = Math.max(dp[i - 1][j], arr[i][j]);
                int fromLeft = Math.max(dp[i][j - 1], arr[i][j]);
                dp[i][j] = Math.min(fromTop, fromLeft);
            }
        }

        System.out.println(dp[n - 1][m - 1]);
    }
}
