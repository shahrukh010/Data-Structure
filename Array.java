package com.code.main.array;
import java.util.*;

public class Array{


    public int getLargest(int[]input){

        int result = 0;
        for(int index = 1; index < input.length; index++){

            if(input[result] < input[index]){
                result = index;
            }
        }

        return result;
    }

    public int secondLargestIndex(int[]input){

        int res = -1;
        int lg  =getLargest(input);

        for(int index = 0; index < input.length; index++){

            if(input[index] !=input[lg]){

                if(res== -1){
                    res = index;
                }
                else if(input[index] > input[res])
                    res = index;
            }
        }
        return res;
    }
    
    //optimize soln of second largest element
    public int getSecondLargest(int[]input){

        int res = -1;

        int lg = 0;
        for(int index = 1; index < input.length; index++){

            if(input[lg] < input[index]){
                res = lg;
                lg = index;
            }
            else if(input[lg] !=input[index]){

                if(res == -1 || input[index] > input[res]){
                    res = index;
                }
            }

      }
         return res;
   }


   public boolean isArraySorted(int[]input){

       for(int index = 1; index < input.length; index++){

           if(input[index] < input[index-1])
               return false;
       }
       return true;
   }

   public int[] reverseArray(int[]input){

       int start = 0; 
       int end = input.length-1;

       while(start < end){

           swap(input,start++,end--);
       }

       return input;
   }

   private void swap(int[]nums,int i,int j){

       int tmp = nums[i];
       nums[i] = nums[j];
       nums[j] = tmp;
   }


   public int[] removeDuplicateFromSortedArray(int[]input){


       int j = 0;

       for(int index = 1; index < input.length; index++){

           if(input[j] !=input[index]){
               input[j+1] = input[index];
               j++;
           }
       }

       return input;

   }


   public int[] moveZero(int[]input){

       int r = 0;

       for(int index = 0; index < input.length; index++){

           if(input[index] !=0){
               swap(input,r,index);
               r++;
           }
       }
       return input;
   }



   public int[] rotateByD(int d, int[] input){

       for(int index = 0; index < d; index++){

           rotate(0, input);
       }
       return input;
   }

   private void rotate(int d, int[]input){

       int tmp = input[0];

       for(int index = 0; index < input.length-1; index++){

           input[index] = input[index+1];
       }
       input[input.length-1] = tmp;
   }


   public int[] getLeaderElement(int[]input){

       int currentLeader = input[input.length-1];
       List<Integer> res = new ArrayList<>();
       res.add(currentLeader);

       for(int index = input.length-2; index >=0; index--){

           if(input[index] >currentLeader){
               currentLeader = input[index];
               res.add(currentLeader);
           }
       }
       return res.stream().mapToInt(i->i).toArray();//convert list to primitive int[] array
           
   }

   public int maxDiff(int[]input){

       int res = input[1] - input[0];

       for(int index = 0; index < input.length; index++){

           for(int j = index + 1; j < input.length; j++){

               res = Math.max(res,input[j] - input[index]);
           }
       }
       return res;
   }


   //optimze
   public int maxDifference(int[]input){

       int res = input[1] - input[0];
       int minValue = input[0];

       for(int index = 1; index  < input.length; index++){

            res = Math.max(res,input[index] - minValue);
            minValue = Math.min(minValue,input[index]);
       }
       return res;
   }


   public void frequence(int[]input){

       int count = 1;
       

       for(int index = 0; index < input.length-1; index++){

           if(input[index] !=input[index+1]){

               System.out.println(input[index]+"-->"+count);
               count = 1;
           }
           else{
               count++;
           }
       }
       System.out.println(input[input.length-1]+"-->"+count);//print last element
   }


   public int maxProfit(int[]input){

       int profit = 0;
       for(int index = 1; index < input.length; index++){

           if(input[index] > input[index-1])//if stock price is less then buy then keep go and if stock price is > then buy then shell and make profit 
               profit +=input[index] - input[index-1];
       }
       return profit;
   }

   public int trapingWater(int[]input){

       int totalWaterContain = 0;
       for(int index = 1; index < input.length-1; index++){

           int lmax = input[index];
           //find left max
           for(int j = 0; j<=index;j++)
               if(input[j] > lmax)
                   lmax = input[j];


           int rmax = input[index+1];
           //find right max
           for(int j = index+1; j < input.length;j++)
               if(input[j] > rmax)
                   rmax = input[j];

           totalWaterContain += ((Math.min(lmax,rmax))-input[index]);

       }
       return totalWaterContain;
   }


   public int maxConsecutiveOnce(int[]input){

       int count = 0;
       int result = 0;
       for(int index = 0; index < input.length; index++){

           if(input[index] !=0){
               count++;

               result = Math.max(result,count);
           }
           else
             count = 0;
       }
       return result;
   }

   public int maxSumSubArray(int[]input){

       int result = Integer.MIN_VALUE;

       for(int index = 0; index < input.length;index++){

           int currentSum = 0;

           for(int j = index; j < input.length; j++){

               currentSum +=input[j];//because of single element also can be greatest like(-6,-1,-8}
           }
        }
                return result;
     }










}

