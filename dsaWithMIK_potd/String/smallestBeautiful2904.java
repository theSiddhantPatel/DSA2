public class smallestBeautiful2904 {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String res = "";
        for (int len = k; len <= n; len++) {
            res = "";
            for (int start = 0; start <= n - len; start++) {
                String temp = s.substring(start, start + len);
                int countOnes = 0;
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) == '1')
                        countOnes++;
                }
                if (countOnes == k) {
                    if (res.isEmpty() || lexicoComp(temp, res)) {
                        res = temp;
                    }
                }
            }
        }
        return res;
    }

    private boolean lexicoComp(String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (b.charAt(i) > a.charAt(i))
                return false;
        }
        return true;
    }
}
