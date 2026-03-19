import java.util.HashMap;

public class largestSubarrayWith0Sum {
    //https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
    int maxLength(int[] arr) {
        // code here
        int maxLen = 0, prefSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);//if total array sum is 0
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if (map.containsKey(prefSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefSum));
            } else map.put(prefSum, i);
        }
        return maxLen;
    }

    static void main() {
        largestSubarrayWith0Sum x=new largestSubarrayWith0Sum();
        int[]arr={15,-2,2,-8,1,7,10,23,-48};
        System.out.println(x.maxLength(arr));
    }
}
