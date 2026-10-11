package homework.h03;

// https://leetcode.com/problems/number-complement/
public class T2 {

    public int findComplement(int num) {
        int mask = 1;

        while (mask < num) {
            mask = (mask << 1) | 1;
        }

        return num ^ mask;
    }
}