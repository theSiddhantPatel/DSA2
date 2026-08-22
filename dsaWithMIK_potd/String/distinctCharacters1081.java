public class distinctCharacters1081 {

  public String smallestSubsequence(String s) {
    int[] lastIndex = new int[26];

    for (int i = 0; i < lastIndex.length; i++) {
      lastIndex[s.charAt(i) - 'a'] = i;
    }
    boolean[] visited = new boolean[26];
  }
}
