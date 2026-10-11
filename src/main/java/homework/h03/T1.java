package homework.h03;

// https://leetcode.com/problems/hamming-distance/
public class h03 {
    class Solution {
        public int hammingDistance(int x, int y) {
            return Integer.bitCount(x ^ y);
        }
    }
}
