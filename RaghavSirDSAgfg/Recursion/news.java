public class news {
    public static void subSets(String s, int idx, String ans) {
        if (idx >= s.length()) {
            System.out.println(ans);
            return;
        }
        subSets(s, idx + 1, ans + s.charAt(idx));
        subSets(s, idx + 1, ans);
    }

    static void main(String[] args) {
       // System.out.println(uniquePaths(2, 2));
        //Recursion_Part2 x = new Recursion_Part2();
        // System.out.println(x.uniquePaths2(12, 12));
        //recPrint(new int[]{1,2,3,4,5},0);
        //System.out.println(elementExistsOrNot(new int[]{1, 3, 3, 5, 6, 4}, 0, 3));
        subSets("abc", 0, "");

    }
}
