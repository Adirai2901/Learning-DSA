import java.util.Comparator;
import java.util.PriorityQueue;

public class _5_2_july {
    class Solution {
    public long minCost(int m, int n, int[][] waitCost) {
         PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        boolean[][][] visited = new boolean[m][n][2];
        pq.offer(new long[]{1, 0, 0, 1});
        int[][] directions = {{1, 0}, {0, 1}};

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long cost = curr[0], i = curr[1], j = curr[2], time = curr[3];
            int parity = (int)(time % 2);

            if (i == m - 1 && j == n - 1) return cost;
            if (visited[(int)i][(int)j][parity]) continue;
            visited[(int)i][(int)j][parity] = true;

            if (parity == 1) {
                for (int[] dir : directions) {
                    int ni = (int)i + dir[0], nj = (int)j + dir[1];
                    if (ni < m && nj < n) {
                        long entryCost = (long)(ni + 1) * (nj + 1);
                        pq.offer(new long[]{cost + entryCost, ni, nj, time + 1});
                    }
                }
            } else {
                pq.offer(new long[]{cost + waitCost[(int)i][(int)j], i, j, time + 1});
            }
        }

        return -1;
    }
}©leetcode
}
