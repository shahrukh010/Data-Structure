import com.code.matrix.Matrix;
public class MatrixMain {


    public static void main(String...strings){

        Matrix matrix = new Matrix();
//        matrix.jaggedMatrix();

        int[][] pattern = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     //   matrix.sneakPattern(pattern);
    //    System.out.println();
//        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      //  matrix.boundaryTraversal(input);
//        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] input = {{1,2},{1,2}};
        matrix.transpose(input);
    }

}
