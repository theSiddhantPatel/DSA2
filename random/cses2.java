import java.io.*;
import java.util.*;

public class cses2 {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int[] songs = new int[n];

        for (int i = 0; i < n; i++) {
            songs[i] = fs.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {
            map.put(songs[right], map.getOrDefault(songs[right], 0) + 1);

            while (map.get(songs[right]) > 1) {
                int x = songs[left++];
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0) map.remove(x);
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nextInt() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return Integer.parseInt(st.nextToken());
        }
    }
}

