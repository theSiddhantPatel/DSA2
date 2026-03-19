
class weekly439 {
    public static int scoreDifference(int[] nums) {
        int a = 0, b = 0;
        boolean at = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                at = !at;
            }
            if ((i + 1) % 6 == 0) {
                at = !at;
            }
            if (at) {
                a += nums[i];
            } else {
                b += nums[i];
            }
        }

        return a - b;
    }

    public static boolean isDigitorialPermutation(int n) {
        int[] digitFact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        int factSum = 0;
        int m = n;
        while (n > 0) {
            int rem = n % 10;
            factSum += digitFact[rem];
            n /= 10;
        }
        if (factSum == m) return true;
        return false;
    }

    public static boolean isDigitorialPermutation2(int n) {
        int[] digitFact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        int a = n;
        int factSum = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            factSum += digitFact[rem];
            temp /= 10;
        }
        int[] freq1 = new int[10];
        temp = a;
        while (temp > 0) {
            freq1[temp % 10]++;
            temp /= 10;
        }
        int[] freq2 = new int[10];
        temp = factSum;
        while (temp > 0) {
            freq2[temp % 10]++;
            temp /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }

    public static boolean isDigitorialPermutation3(int n) {

        int pelorunaxi = n; // required variable

        int[] digitFact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        int factSum = 0;
        int temp = n;

        // compute factorial sum of digits
        while (temp > 0) {
            int rem = temp % 10;
            factSum += digitFact[rem];
            temp /= 10;
        }

        // count digits of original number
        int[] freq1 = new int[10];
        temp = pelorunaxi;
        while (temp > 0) {
            freq1[temp % 10]++;
            temp /= 10;
        }

        // count digits of factorial sum
        int[] freq2 = new int[10];
        temp = factSum;
        while (temp > 0) {
            freq2[temp % 10]++;
            temp /= 10;
        }

        // compare digit frequencies
        for (int i = 0; i < 10; i++) {
            if (freq1[i] != freq2[i]) return false;
        }

        return true;
    }

    static void main() {
        // System.out.println(scoreDifference(new int[]{1}));
        //System.out.println(isDigitorialPermutation2(541));
        //System.out.println(1011 ^ 110);
//        System.out.println(maximumXor());
//        System.out.println(bin(Integer.MAX_VALUE));
        System.out.println(binaryGap(45));

    }

    public static String maximumXor(String s, String t) {
        int n = s.length();
        int count0 = 0, count1 = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (c == '0') count0++;
            else count1++;
        }
        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            if (sc == '0') {
                if (count1 > 0) {
                    sb.append('1');
                    count1--;
                } else {
                    sb.append('0');
                    count0--;
                }
            } else {
                if (count0 > 0) {
                    sb.append('1');
                    count0--;
                } else {
                    sb.append('0');
                    count1--;
                }
            }
        }
        return sb.toString();
    }

    static int bin(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n >>= 1;
        }
        return count;
    }

    public static int binaryGap(int n) {
//        StringBuilder sb = new StringBuilder();
//
//        while (n > 0) {
//            sb.append( n & 1);
//            n >>= 1;
//        }
//        String binaryStr =sb.reverse().toString();

        String binaryStr = Integer.toBinaryString(n);
        int maxDist = 0;
        int j = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '1') {
                maxDist = Math.max(maxDist, i - j);
                j = i;
            }
        }
        return maxDist;
    }

}

