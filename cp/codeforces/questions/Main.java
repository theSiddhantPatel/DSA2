import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    static String next() throws Exception {
        while (!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }


    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(next());
        int l = Integer.parseInt(next());
        int r = Integer.parseInt(next());
        String s = next();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && j - i <= r && j - i >= l) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}