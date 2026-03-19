import java.util.HashMap;
import java.util.Map;

public class anagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        //return map1.equals(map2);  //this line is equals to the written code below
        if (map1.size() != map2.size()) return false;

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            // used to iterate over all key-value pairs in a Map.
            char key = entry.getKey();
            int freq = entry.getValue();

            if (!map2.containsKey(key)) return false;
            if (!map2.get(key).equals(freq)) return false;
        }

        return true;


    }

    //we can optimize it using a single map
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            map.put(c1, map.getOrDefault(c1, 0) + 1);
            map.put(c2, map.getOrDefault(c2, 0) - 1);

        }
        for (int val : map.values()) {
            if (val != 0) return false;
        }
        return true;
    }

    static void main() {
        anagram242 x = new anagram242();
        System.out.println(x.isAnagram("anagram", "agaram"));
    }
}
