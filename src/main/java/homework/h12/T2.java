package homework.h12;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {
        public int maximumCount(int[] nums) {
            int positives = 0;
            int negatives = 0;

            for (int number : nums) {
                if (number > 0) {
                    positives++;
                } else if (number < 0) {
                    negatives++;
                }
            }

            return Math.max(positives, negatives);
        }
}