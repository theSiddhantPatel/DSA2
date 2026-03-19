import java.util.Scanner;

public class codeforces {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int h = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            int[] b = new int[m];
            int[] c = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = s.nextInt();
                c[i] = s.nextInt();
            }

            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++) {
                arr2[i] = a[i];
            }
            int l = Math.min(n, m);
            for (int i = 0; i < l; i++) {
                a[i] = a[i] + c[i];
                if (a[i] > h) {
                    for (int j = 0; j <= i; j++) {
                        a[j] = arr2[j];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}