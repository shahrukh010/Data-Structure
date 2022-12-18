import com.code.main.math.Mathmatics;
import com.code.main.array.Array;
public class Main{

    public static void main(String...strings){

        Mathmatics math = new Mathmatics();

        int n = 9235;
            n = 12345;
    //    int result = math.countDigit(n);
   //     System.out.println(result);
       
            n = 121;
            n = 78987;
            n = 9235;
            
  //     boolean result = math.isPalindrome(n);
  //     System.out.println(result);

            n = 5;
            n = 6;
            n = 1;
            n = 0;
//        int result = math.factorial(n);
 //       System.out.println(result);
 
            n = 20;
            n = 251;
//            int result = math.countTrailingZero(n);
 //           System.out.println(result);
 //

            int a = 2,b=4;
                a = 100;
                b=200;
//                a = 7;
 //               b = 13;
//            int result = math.gcd(a,b);
 //           System.out.println(result);
 //

            a = 4;
            b = 6;
            a = 12;
            b = 15;

//            int result = math.lcm(a,b);
 //           System.out.println(result);
 //
            int number=13;
            number = 12;
            number = 101;
            number = 25;
            number = 65;
            number = 7;
            number = 121;
            number = 1031;

            //boolean result = math.isPrime(number);
            //System.out.println(result);
            //
            
            number = 12;
            number = 315;
            number = 13;
            number = 84;
            number = 450;
            
//          java.util.List result = math.primeFactor(number);
 //         System.out.println(result);
 

  //          number = 15;
 //           number = 100;
            number = 7;
//            java.util.List result = math.allDivisor(number);
 //           System.out.println(result);

            /*
            number = 16;
            boolean result[] = math.printAllPrime(number);

            for(int index = 2; index < result.length; index ++)
                if(!result[index])
                    System.out.print(index+" ");

            */


            Array array = new Array();
 //           int[] input = {5,20,12,20,10};
//              int[] input = {10,10,10,10,10};

//            int result = array.getLargest(input);
           // result = array.secondLargestIndex(input);
            // result = array.getSecondLargest(input);
            //
//            int[] nums = {10,10,12,12,13};
  //          boolean result = array.isArraySorted(nums);
//            int[] input = {1,2,3,4,5,0};
 //           int[]result = array.reverseArray(input);

//            int[] nums = {10,20,20,30,30,30};
 //           int[] nums = {10,10,20,30,30,40};

//            int[]result = array.removeDuplicateFromSortedArray(nums);
//            int[] nums = {8,5,0,10,0,20};
//            int[] nums = {0,8,5,0,10,0,20};
//           int[]result = array.moveZero(nums);
//            int[] nums = {1,2,3,4,5};
 //           int[] result = array.rotateByD(3,nums);
//            int[] nums = {7,10,4,3,6,5,2};
 //           int[] result = array.getLeaderElement(nums);

            //int[] nums = {2,3,10,6,4,8,1};
//            int[] nums = {7,9,5,6,3,2};
 //            int result = array.maxDiff(nums);
  //           result = array.maxDifference(nums);
                          
            //int[] nums = {10,10,10,25,30,30,40};
            //int[] nums = {10,10,10,10};
            //int[] nums = {10,20,30};
//            int[] nums = {10,10,10,30,30,40};
 //                   array.frequence(nums);
  //           System.out.println(nums);
    //        System.out.println(java.util.Arrays.toString(result));

            //int nums[] = {1,5,3,1,2,8};
//            int nums[] = {1,5,3,8,12};
 //           int result = array.maxProfit(nums);

//            int nums[] = {3,0,1,2,5};
//            int nums[] = {3,0,1,2,5};
 //           int result = array.trapingWater(nums);
//            int[] input = {0,1,1,0,1,0,1,0,1,0,1,};
 //           int result = array.maxConsecutiveOnce(input);

            //int[] nums = {2,3,-8,7,-1,2,3};
            //int[] nums = {5,8,3};
           // int[] nums = {-6,-1,-8};
            //int result = array.maxSumSubArray(nums);

//            int[] nums = {10,12,4,7,8};
//            int[] nums = {10,4,8,8};
            int[] nums = {7,10,13,14};
            int result = array.longestEvenOdd(nums);
            System.out.println(result);
    }
}
