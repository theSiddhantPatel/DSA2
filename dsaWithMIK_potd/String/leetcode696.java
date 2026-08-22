public class leetcode696 {
//    public int countBinarySubstrings(String s) {
//        int n = s.length();
//        int count = 0;
//        int countx=0,county=0;
//        for (int i = 0; i < n; i++) {
//            int j = i;
//            char ch = s.charAt(i);
//            while (j < n && s.charAt(j) == ch) {
//                j++;
//                countx++;
//            }
//            if (j < n)
//                ch = s.charAt(j);
//            int k = j;
//            while (k < n && s.charAt(k) == ch) {
//                k++;
//                county++;
//                if (countx==county) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        return count;
//    }

    public int countBinarySubstrings(String s) {
        int n = s.length();
        int count = 0, countx, county;
        for (int i = 0; i < n; i++) {
            int j = i;
            countx = 0;
            county = 0;
            char ch = s.charAt(i);
            while (j < n && s.charAt(j) == ch) {
                j++;
                countx++;
            }
            if (j < n)
                ch = s.charAt(j);
            int k = j;
            while (k < n && s.charAt(k) == ch) {
                county++;k++;
                if (countx == county) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    static void main(String[] args) {
        leetcode696 x = new leetcode696();
        System.out.println(x.countBinarySubstrings("00110"));
    }
}
