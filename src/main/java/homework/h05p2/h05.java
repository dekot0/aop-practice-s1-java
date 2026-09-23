package homework.h05p2;

public class h05 {
        public int addDigits(int num) {

            if (num == 0) {
                return 0;
            }
            return 1 + (num - 1) % 9;
        }
    }


