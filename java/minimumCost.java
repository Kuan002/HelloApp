public class minimumCost {
    public static void main(String[] args) {

        Solution solution = new Solution();

        // ===== 示例 1 =====
        String source1 = "abcd";
        String target1 = "acbe";
        char[] original1 = {'a','b','c','c','e','d'};
        char[] changed1  = {'b','c','b','e','b','e'};
        int[] cost1      = {2,5,5,1,2,20};

        long result1 = solution.minimumCost(source1, target1, original1, changed1, cost1);
        System.out.println("Example 1 result: " + result1); // 28

        // ===== 示例 2 =====
        String source2 = "aaaa";
        String target2 = "bbbb";
        char[] original2 = {'a','c'};
        char[] changed2  = {'c','b'};
        int[] cost2      = {1,2};

        long result2 = solution.minimumCost(source2, target2, original2, changed2, cost2);
        System.out.println("Example 2 result: " + result2); // 12

        // ===== 示例 3 =====
        String source3 = "abcd";
        String target3 = "abce";
        char[] original3 = {'a'};
        char[] changed3  = {'e'};
        int[] cost3      = {10000};

        long result3 = solution.minimumCost(source3, target3, original3, changed3, cost3);
        System.out.println("Example 3 result: " + result3); // -1
    }
}

class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {

        long INF = Long.MAX_VALUE / 4;
        long[][] dist = new long[26][26];

        // initialization
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                dist[i][j] = (i == j) ? 0 : INF;
            }
        }

        // Conversion rules
        for (int i = 0; i < original.length; i++) {
            int from = original[i] - 'a';
            int to = changed[i] - 'a';
            dist[from][to] = Math.min(dist[from][to], cost[i]);
        }

        // Floyd-Warshall
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Calculate total cost
        long ans = 0;
        for (int i = 0; i < source.length(); i++) {
            char s = source.charAt(i);
            char t = target.charAt(i);

            if (s == t) continue;

            int from = s - 'a';
            int to = t - 'a';

            if (dist[from][to] == INF) {
                return -1;
            }
            ans += dist[from][to];
        }

        return ans;
    }
}
