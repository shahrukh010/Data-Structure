package com.code.main.array;

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








}

