public class oneSegment1784 {
    public static boolean checkOnesSegment(String s) {
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == '1') break;
            i++;
        }
        while (i < n) {
            if (s.charAt(i) == '0') break;
            i++;
        }
        while (i < n) {
            if (s.charAt(i) == '1') return false;
            i++;
        }
        return true;
    }

    static void main() {
        System.out.println(checkOnesSegment("0000111110000"));
    }
}
