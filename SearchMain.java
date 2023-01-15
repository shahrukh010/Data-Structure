
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

//        int[] input = {10,20,40,60,5,8};
        //int result = search.searchFromRotatedArray(input,5);
        //int result = search.searchFromRotatedArray(input,8);
        //int result = search.searchFromRotatedArray(input,20);
//        int result = search.searchFromRotatedArray(input,10);
 //       System.out.println(result);

        //int[] input = {10,7,8,20,12};
       // int[] input = {5,10,20,15,7};
        //int result = search.peakElement(input);
        //System.out.println(result);

       // int[] input =  {10,20,15,2,23,90,67};
//        int[] input =  {5,10,20,15};
       // int[] input =  {5,10,10,15,100};
        //int[] input =  {5,10,10,15,100,50};
//        int[] input =  {1,3,20,4,1,0};
 //       int result = search.peakBinarySearch(input);

//        int[] a = {1,12,15,26,38};
 //       int[] b = {2,13,17,30,45};
//        int[] a = {10,20,30,40,50};
 //       int[] b = {5,15,25,35,45};
        int[] a = {1,2,3,4,5,6};
        int[] b = {10,20,30,40,50};

//        int[] input = {0,2,1,3,2};
//           int[] input = {0,1,3,2,4,5};
//          int[] input = {5,4,1,5,3,2};
//        int result = search.midElement(a,b);
//        int result = search.repeatElement(input);
//          int[] input = {2,5,8,12,30};   
//          int[] input = {3,8,13,18};   
          //int[] input = {2,3,8,11};   

        int[] input = {2,3,4,8,9,20,40};
           //boolean  result = search.isExistsTarget(input,14);
           boolean result = search.tripletExists(input,69);
        System.out.println(result);
    }

}
