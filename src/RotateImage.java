public class RotateImage {

    public static void rotate(int[][] matrix) {

        if (matrix.length % 2 == 0) {
            for (int l = matrix.length / 2,m= matrix.length-1; l < matrix.length; l++) {
                matrix[m][l] = matrix[m][matrix.length - l];

                for (int i = 0; i < matrix.length / 2; i++) {
                    matrix[l][i] = matrix[l][Math.abs(matrix.length - i)];


                    for (int k = matrix.length / 2; k < matrix.length; k++) {
                        matrix[i][k] = matrix[Math.abs(matrix.length - i)][k];
                        for (int j = 0; j < matrix.length / 2; j++) {
                            matrix[k][j] = matrix[i][Math.abs(matrix.length - j)];
                        }

                    }

                }


            }

        }
    }



    public static void main(String[] args) {


        //Input: //
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //Output: [[7,4,1],[8,5,2],[9,6,3]]
        System.out.println(matrix.length);
        rotate(matrix);
    }
}
