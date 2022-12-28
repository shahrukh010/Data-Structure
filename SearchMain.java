
import com.code.main.search.Search;

public class SearchMain {


    public static void main(String[]args){


        Search search = new Search();

        /*
        int[] input = {1,2,3,4,5,6};
        int result = search.binarySearch(input,6);
        System.out.println(result);

        */

        int[] input = {1,10,10,10,20,20,40};
        //int result = search.firstIndex(input,20);
        //int result = search.firstIndex(input,10);
//        int result = search.firstIndex(input,1);
        int result = search.firstIndex(input,40);
        System.out.println(result);
    }

}
