import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class isomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else if (map.containsValue(t.charAt(i))) {
                return false;
            } else map.put(s.charAt(i), t.charAt(i));
        }
        return true;

    }

    //using Hashset
    public boolean isIsomorphic2(String s, String t) {
        //if (s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            // If s-character already mapped, check consistency
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            }
            else {
                // If c2 is already used by some other mapping → invalid
                if (used.contains(c2)) return false;

                map.put(c1, c2);
                used.add(c2);
            }
        }

        return true;
    }

    static void main() {
        isomorphicStrings205 x = new isomorphicStrings205();
        System.out.println(x.isIsomorphic2("fofo", "abab"));
    }
}
