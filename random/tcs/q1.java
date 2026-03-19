package tcs;

import java.io.*;

public class q1 {
    static StringBuilder sb = new StringBuilder();

    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine().trim());
        int n2 = Integer.parseInt(br.readLine().trim());
        int n3 = Integer.parseInt(br.readLine().trim());
        char[] res = new char[n1 + n2 + n3];

        generatePermutations(n1, n2, n3, res, 0);
        System.out.println(sb.toString());
    }

    static void generatePermutations(int a, int b, int c, char[] result, int index) {

        // base case: permutation completed
        if (index == result.length) {
            sb.append(result).append("\n");
            return;
        }

        // choose 'a'
        if (a > 0) {
            result[index] = 'a';
            generatePermutations(a - 1, b, c, result, index + 1);
        }

        // choose 'b'
        if (b > 0) {
            result[index] = 'b';
            generatePermutations(a, b - 1, c, result, index + 1);
        }

        // choose 'c'
        if (c > 0) {
            result[index] = 'c';
            generatePermutations(a, b, c - 1, result, index + 1);
        }
    }
}
