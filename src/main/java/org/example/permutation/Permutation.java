package org.example.permutation;

public class Permutation {
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2;
        visited = new boolean[arr.length];
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
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = origin[i];
                permutation(origin, depth + 1, r);
                visited[i] = false;
            }
        }
    }

}
