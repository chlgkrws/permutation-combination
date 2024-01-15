package org.example.combination;

public class Combination {
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2;
        visited = new boolean[arr.length];
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
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = origin[i];
                permutation(origin, depth + 1, i + 1, r);
                visited[i] = false;
            }
        }
    }

}
