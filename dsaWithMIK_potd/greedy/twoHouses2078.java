package dsaWithMIK.greedy;

public class twoHouses2078 {
    public static int maxDistance(int[] colors) {
        int n = colors.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (colors[0] != colors[i])
                res = Math.max(res, i);
            if (colors[n - 1] != colors[i])
                res = Math.max(res, n - 1 - i);
        }
        return res;
    }

}
