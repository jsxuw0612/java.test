package cn.xrx.test;


import java.util.PriorityQueue;

public class test4 {
    PriorityQueue<Integer> pq;
    int k;

    public void KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for (int x : nums) {
            add(x);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }


}
