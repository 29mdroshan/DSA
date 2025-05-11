package _9_Heap;

import java.util.PriorityQueue;

//https://neetcode.io/problems/kth-largest-integer-in-a-stream
//https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
public class _1_KLargestElementInStream {
    PriorityQueue minheap;
    int k;

    public _1_KLargestElementInStream(int k, int[] nums) {
        minheap = new PriorityQueue();
        this.k = k;
        for(int i : nums) {
            minheap.offer(i);
            if(minheap.size() > k) {
                minheap.poll();
            }
        }
    }

    public int add(int val) {
        minheap.offer(val);
        if(minheap.size() > k) {
            minheap.poll();
        }
        return (int) minheap.peek();
    }
}
