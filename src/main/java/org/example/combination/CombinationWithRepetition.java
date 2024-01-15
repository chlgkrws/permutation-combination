package org.example.combination;

public class CombinationWithRepetition {
    static int[] result;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2;
        result = new int[r];

        permutation(arr, 0, 0, r);
    }

    public static void permutation(int[] origin, int depth, int start, int r) {
        if (depth == r) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < origin.length; i++) {
            result[depth] = origin[i];
            permutation(origin, depth + 1, i, r);
        }
    }
}
