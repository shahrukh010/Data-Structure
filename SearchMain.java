
import com.code.main.search.Search;

public class SearchMain {


    public static void main(String[]args){


        Search search = new Search();

        int[] input = {1,2,3,4,5,6};
        int result = search.binarySearch(input,6);
        System.out.println(result);

    }

}
