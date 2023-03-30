package com.bycsmys.algo.bytedance;

import java.util.PriorityQueue;

public class FindKthLargest_215 {

    public static void main(String[] args) {
        int kthLargest = findKthLargest(new int[]{1, 2, 3, 6, 5, 4}, 1);
        System.out.println(kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1 - o2);

        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(nums[i]);
            } else if(priorityQueue.peek() < nums[i]){
                priorityQueue.poll();
                priorityQueue.add(nums[i]);
            }
        }
        return priorityQueue.poll();
    }

}
