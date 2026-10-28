package homework.h08;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class T2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }

        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }

        return result;
    }
}
