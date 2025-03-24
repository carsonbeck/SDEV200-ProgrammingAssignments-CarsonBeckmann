import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 3x3 array:");
        int[][] m1 = readArray(input);

        System.out.println("Enter the second 3x3 array:");
        int[][] m2 = readArray(input);

        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        }
        else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static int[][] readArray(Scanner input) {
        int[][] array = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j< 3; j++) {
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        int[] flatM1 = flattenAndSort(m1);
        int[] flatM2 = flattenAndSort(m2);

        for (int i = 0; i < flatM1.length; i++) {
            if (flatM1[i] != flatM2[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] flattenAndSort(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[] flat = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flat[index++] = array[i][j];
            }
        }

        java.util.Arrays.sort(flat);
        return flat;
    }
}

