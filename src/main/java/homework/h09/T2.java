package homework.h09;

// https://leetcode.com/problems/reverse-string/submissions/2189491353/
public class T2 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
