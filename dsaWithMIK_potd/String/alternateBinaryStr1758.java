public class alternateBinaryStr1758 {
    public static int minOperations(String s) {

        int n = s.length();
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            str.append("01");
            str2.append("10");
        }
        if (n % 2 == 1) {
            str.append("0");
            str2.append("1");
        }
        String st1 = str.toString();
        String st2 = str2.toString();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != st1.charAt(i)) {
                count1++;
            }
            if (s.charAt(i) != st2.charAt(i)) {
                count2++;
            }
        }
        System.out.println(st1 + "," + st2);
        return Math.min(count1, count2);
    }

    static void main() {
        System.out.println(minOperations("10010100"));
    }
}
