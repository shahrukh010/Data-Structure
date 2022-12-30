
import com.code.main.search.Search;

public class SearchMain {


    public static void main(String[]args){


        Search search = new Search();

        /*
        int[] input = {1,2,3,4,5,6};
        int result = search.binarySearch(input,6);
        System.out.println(result);

        */

        //int[] input = {1,10,10,10,20,20,40};
        //int result = search.firstIndex(input,20);
        //int result = search.firstIndex(input,10);
//        int result = search.firstIndex(input,1);
//
        //int result = search.lastIndex(input,40);
        //int result = search.lastIndex(input,0);
//        int[] input = {5,8,8,10,10};

//        int[] input = {10,20,20,20,30,30};
//        int result = search.ocuurences(input,100);

//        int[] input = {0,0,0,0,1,1,1,1,};
    //    int[] input = {0,0,0,0,1};
     //   int result = search.count1sBinaryArray(input);

           //int result = search.squareRoot(4); 
          // int result = search.squareRoot(15); 
//           int result = search.squareRoot(25); 
//            int result = search.squareRoot(10); 
 //           System.out.println(result);

//        int[] input = {1,10,15,20,40,80,90,120,500,Integer.MAX_VALUE};

//        int result = search.searchFromInfiniteArray(input,5000);
//          int result = search.searchFromInfinite(input,500);
          //int result = search.searchFromInfinite(input,5000);
          //int result = search.searchFromInfinite(input,15);
//          int result = search.searchFromInfinite(input,120);
//          int result = search.searchFromInfinite(input,10);

        int[] input = {10,20,40,60,5,8};
        //int result = search.searchFromRotatedArray(input,5);
        //int result = search.searchFromRotatedArray(input,8);
        //int result = search.searchFromRotatedArray(input,20);
        int result = search.searchFromRotatedArray(input,10);
        System.out.println(result);
    }

}
