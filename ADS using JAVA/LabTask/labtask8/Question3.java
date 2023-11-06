package labtask8;
public class Question3 {
    public static void findPosition(int[][] matrix, int key) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element " + key + " found at row " + i + " and column " + j);
                    return;
                }
            }
        }

        System.out.println("Element " + key + " not found in the array.");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int key = 5;

        findPosition(matrix, key);
    }
}

