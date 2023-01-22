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
 //      int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int[][] input = {{1,2},{1,2}};
  //      matrix.transpose(input);

//        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//          int[][] input = {{1,2,3},{4,5,6},{7,8,9}};

 //       matrix.rotate90(input);

        //int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] input = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
//        int[][] input = {{10,20,30,40},{15,23,35,45},{27,29,37,48},{32,33,39,50}};
        //matrix.spiral(input);
        //
    boolean res = matrix.searchFromSortedMatrix(input,11);
        System.out.println(res);
    }

}
