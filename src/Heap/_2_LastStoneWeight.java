package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

//https://neetcode.io/problems/last-stone-weight
//https://leetcode.com/problems/last-stone-weight/description/
public class _2_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
//      PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones) {
            maxheap.offer(i);
        }
        while(maxheap.size() > 1) {
            int i = maxheap.poll();
            int j = maxheap.poll();
            int result = Math.abs(i - j);
            if(result > 0) {
                maxheap.add(result);
            }
        }
        return maxheap.peek() != null ? maxheap.poll(): 0;

    }
}
