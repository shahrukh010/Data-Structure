import com.code.sort.Sort;

public class SortMain {



    public static void main(String... strings){

        Sort sort = sort = new Sort();

//        int[] nums = {2,10,8,7};
//          int[] nums = {10,5,8,20,2,18};
          //int[] nums = {10,0,1,3,5,8,20,6,2,18,7,4,9};
          int[] nums = {10,1,3,5,8,6,2,7,4,9,0,-2,-1};
//        sort.bubble(nums);
//          sort.selection(nums);

          sort.insertion(nums);
        System.out.println(java.util.Arrays.toString(nums));

    }

}
