import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class q2 {
    /*You are given n distinct pairs.
    Each pair is numbered from 1 to n.
    All these pairs are initially placed in a bag.

    You need to pair up each number.

    You take numbers one by one from the bag, and for each number you check whether the pair of this number has already been taken out of the bag or not.

    If not (meaning its pair is still in the bag), you place the current number on the table.

    Otherwise, if its pair is already on the table, you remove both numbers of the pair from the table and set them aside.

    You must print the maximum number of numbers that were on the table at the same time.*/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        char nextChar() {
            return next().charAt(0);
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static void main() {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n*2];
        for (int i = 0; i < 2 * n; i++) {
            arr[i]=fr.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        int setLen = 0;
        for (int val : arr) {
            if (!set.contains(val)) {
                set.add(val);
                setLen = Math.max(setLen, set.size());
            } else set.remove(val);
        }
        System.out.println(setLen);
    }
}
