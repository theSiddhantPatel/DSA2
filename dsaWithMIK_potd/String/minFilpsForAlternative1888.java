public class minFilpsForAlternative1888 {

    public static int minFlips(String s) {
        int n = s.length();
        s = s + s;
        int count = 0;
        int min2 = 0;
        int min = 1000000;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i; j < (i + n); j++) {
                char expected = (j % 2 == 0) ? '0' : '1';
                if (s.charAt(j) != expected) count++;

            }
            min = Math.min(min, count);
            min2 = Math.max(min2, count);
//            System.out.println(s);
//            System.out.println(min + " " + min2);
        }
        min = (Math.min(min, n - min2));
        return min;
    }

    static void main() {

        System.out.println(minFlips("111000"));
    }
}
