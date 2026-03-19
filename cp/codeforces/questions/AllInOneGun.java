import java.util.Scanner;

public class AllInOneGun {

    static long timeToKill(int n, long h, long k, long[] a) {
        long total = 0;
        for (long damage : a) {
            total += damage;
        }

        // Check if we can kill within first magazine
        long damage = 0;
        for (int i = 0; i < n; i++) {
            damage += a[i];
            if (damage >= h) {
                return i + 1;  // Killed in first magazine
            }
        }

        // Need multiple magazines
        // Calculate how many complete magazines we need
        long magazinesNeeded = (h + total - 1) / total;  // Ceiling division

        // Health remaining after (magazinesNeeded - 1) complete magazines
        long remainingHealth = h - (magazinesNeeded - 1) * total;

        // Find how many bullets from the last magazine we need
        damage = 0;
        long bulletsInLastMag = 0;
        for (int i = 0; i < n; i++) {
            damage += a[i];
            bulletsInLastMag++;
            if (damage >= remainingHealth) {
                break;
            }
        }

        // Total time = (magazines_needed - 1) * n + (magazines_needed - 1) * k + bullets_in_last_mag
        long totalTime = (magazinesNeeded - 1) * n + (magazinesNeeded - 1) * k + bulletsInLastMag;
        return totalTime;
    }

    static long solve(int n, long h, long k, long[] a) {
        long minTime = timeToKill(n, h, k, a);

        // Try all possible swaps with the last element
        for (int i = 0; i < n - 1; i++) {
            // Swap position i with last position
            long temp = a[i];
            a[i] = a[n - 1];
            a[n - 1] = temp;

            minTime = Math.min(minTime, timeToKill(n, h, k, a));

            // Restore original arrangement
            temp = a[i];
            a[i] = a[n - 1];
            a[n - 1] = temp;
        }

        return minTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            System.out.println(solve(n, h, k, a));
        }

        sc.close();
    }
}
