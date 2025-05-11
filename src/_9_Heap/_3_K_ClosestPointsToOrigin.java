package _9_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

// https://neetcode.io/problems/k-closest-points-to-origin
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class _3_K_ClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[0]).reversed());
        for(int[] i : points) {
            int dist = i[0] * i[0] + i[1]*i[1];
            maxheap.offer(new int[]{dist, i[0], i[1]});
            if (maxheap.size() > k) {
                maxheap.poll();
            }
        }

        int[][] result = new int[k][2];
        for(int i = 0 ; i < k; i++) {
            int[] point = maxheap.poll();
            result[i] = new int[]{point[1], point[2]};
        }
        return result;

    }
}
