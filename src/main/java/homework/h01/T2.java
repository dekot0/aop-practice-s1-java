package homework.h05p2;

// https://leetcode.com/problems/a-number-after-a-double-reversal/
public class h05 {
        public int addDigits(int num) {

            if (num == 0) {
                return 0;
            }
            return 1 + (num - 1) % 9;
        }
    }


