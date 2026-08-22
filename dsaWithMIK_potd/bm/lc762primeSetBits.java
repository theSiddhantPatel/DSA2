public class lc762primeSetBits {

    public static int countPrimeSetBits(int left, int right) {
        int primes = 0;

        for (int i = left; i <= right; i++) {
            int j=i;
            int countsetBits = 0;
            while (j > 0) {
                countsetBits += (j & 1);
                j >>= 1;
            }
            boolean flag = true;
            for (int k = 2; k*k <= countsetBits; k++) {
                if (countsetBits % k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag&&countsetBits!=1) primes++;
        }
        return primes;
    }

    static void main() {
        System.out.println(countPrimeSetBits(10, 15));
    }
}
