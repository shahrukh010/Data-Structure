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

//          sort.insertion(nums);
//          int[] a = {10,15,20};
//          int[] b = {5,6,6,15};

          //int[] a = {1,2,3,4,6,8};
          //int[] b = {5,7,9,10,};
//          int[] sortedArray = sort.mergeTwoSortedArray(a,b);
          
          //int[]input = {1,2,10,15,20,21,22,3,5,6,11,30,33,0};

          //int mid = ((input.length-1)/2);
          //int high = input.length-1;
//          int[] sortedArray = sort.merge(input,0,mid,high);
          //int[] sortedArray = sort.mergeSort(input,0,input.length-1);
//        System.out.println(java.util.Arrays.toString(sortedArray));

//          int[] a = {3,5,10,10,15,15,20};
//          int[] b = {5,10,10,15,30};

//          int[] a = {1,1,3,3,3};
//         int[] b = {1,1,1,3,5,7};
//          int[] a = {1,20,20,40,60};
//          int[] b = {2,20,20,20};

 //         sort.common(a,b);

//          int[] a = {3,5,8};
//          int[] b = {2,8,9,10,15};

//          int[] a = {2,3,3,3,4,4};
//          int[] b = {4,4};

//          int[] a = {10,20,20};
//          int[] b = {5,20,40,40};
//          sort.union(a,b);

//          int[] arr = {2,4,1,3,5};
//            int[] arr = {10,20,30,40};
//          int[] arr = {40,30,20,10};
//          int result = sort.countInversion(arr);
//          System.out.println(result);

          //int[] input = {10,80,30,90,40,50,70};
//          int[] input = {70,60,80,40,30};

//          sort.partitionByLomuto(input,0,input.length-1);
          //int[] input = {5,3,8,4,2,7,1,10};
//          sort.partitionByHoars(input);
 //         System.out.println(java.util.Arrays.toString(input));
          int[] input = {8,4,7,9,3,10,5,0,-4};
          sort.quickSort(input,0,input.length-1);
          System.out.println(java.util.Arrays.toString(input));
    }

}
