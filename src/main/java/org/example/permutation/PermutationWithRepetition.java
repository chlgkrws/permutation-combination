package org.example.permutation;

public class PermutationWithRepetition {
    static int[] result;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 3;
        result = new int[r];

        permutation(arr, 0, r);
    }

    public static void permutation(int[] origin, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < origin.length; i++) {
            result[depth] = origin[i];
            permutation(origin, depth + 1, r);
        }
    }
}
