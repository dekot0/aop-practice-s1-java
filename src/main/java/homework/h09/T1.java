package homework.h09;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/
public class T1 {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char next = (char) ((word.charAt(i) - 'a' + 1) % 26 + 'a');
                word.append(next);
            }
        }

        return word.charAt(k - 1);
    }
}
