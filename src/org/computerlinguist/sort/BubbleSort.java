package org.computerlinguist.sort;

public class BubbleSort {
    static void sort(int[] nums) {
        boolean swapHappened = true;
        while (swapHappened) {
            swapHappened = false;
            for (int i = 0; i < nums.length - 1; i++) {
                int j = i + 1;
                int itemAtI = nums[i];
                int itemAtJ = nums[j];
                if (itemAtI > itemAtJ) {
                    nums[i] = itemAtJ;
                    nums[j] = itemAtI;
                    swapHappened = true;
                }
            }
        }
    }
}
