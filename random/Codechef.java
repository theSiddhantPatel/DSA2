import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
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

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        Scanner s=new Scanner(System.in);
            while (t--> 0) {
//                int n = s.nextInt();
//
//                int sum=0;
//                for(int i=0;i<n;i++){
//                    sum+=s.nextInt();
//                }
//                if(sum<0)
                    System.out.println((int)Math.ceil(-(-7/2)));
//                else System.out.println(0);
            }


        }

    }
