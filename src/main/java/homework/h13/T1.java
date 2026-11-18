package homework.h13;


public class T1 {

    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        T1 t = new T1();
        System.out.println(t.removeDuplicates("abbaca")); // ca
        System.out.println(t.removeDuplicates("azxxzy")); // ay
    }
}
