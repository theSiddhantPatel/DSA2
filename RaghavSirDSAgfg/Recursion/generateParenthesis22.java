import java.util.ArrayList;
import java.util.List;

public class generateParenthesis22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }

    void generate(int n, int l, int r, String s, List<String> res) {
        if (r == n) {
            res.add(s);
//            System.out.print(s+" ");
            return;
        }
        if (l < n) generate(n, l + 1, r, s + "(", res);
        if (r < l) generate(n, l, r + 1, s + ")", res);
    }

    void main() {
//        for(String s:generateParenthesis(2)){
//            System.out.println(s);
//         }

        pip(3);
    }

    void pip(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        pip(n - 1);
        System.out.print(n + " ");
        pip(n - 1);
        System.out.print(n + " ");
    }
}

