package com.code.main.search;

public class Search {



    public int binarySearch(int[] input, int target){

        int low = 0;
        int high = input.length-1;//n-1 because of low is start from 0

        while(low <= high){

            int mid = (low+high) / 2;//if we have not large set of array then we can use or where overflow situation not raise
//            int mid = low +(high - low) / 2;//this formula for if we have largest set of array to overcome overflow

            if(input[mid] == target)
                return mid;

            if(input[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }


    public int firstIndex(int[]input, int target){

        int low = 0;
        int high = input.length-1;

        while(low <= high){


            int mid = (low +(high - low)/2);

            if(input[mid] == target){

                if(mid==0 || input[mid-1] != target)
                    return mid;
            }

            if(input[mid] < target)
                low = mid+1;

            else
                high = mid-1;

    }
    return -1;
    }

        public int lastIndex(int[]input, int target){

            int low = 0;
            int high = input.length-1;

            while(low <= high){

                int mid = (low +(high - low)/2);

                if(input[mid] == target){

                    if(mid == input.length-1 || input[mid+1] !=target)
                        return mid;
                    low = mid+1;
                }
                else if(input[mid] < target)
                    low = mid+1;
                else
                    high = mid-1;
          }
            return -1;
        }



            
            public int ocuurences(int[]input,int target){

                int firstIndex = firstIndex(input,target);
                int lastIndex = lastIndex(input,target);


                return firstIndex == -1 ? 0 : (lastIndex - firstIndex + 1);
            }

            public int count1sBinaryArray(int[]input){

                int firstIndex = firstIndex(input,1);

                return (input.length - firstIndex);
            }


            public int squareRoot(int n){

                /*
                int res = 0;
                for(int index = 1; index * index <=n; index++){

                    res = index;
                }*/

                /*
                int res = 1;
                while(res*res <=n){
                    res++;
                }
                return res-1;
                */

                int ans = -1;

                int low = 1;
                int high = n;

                while(low<=high){

                    int mid = (low + (high - low)/2);
                    int midSq = mid * mid;

                    if(midSq == n)return mid;

                    if(midSq > n)
                        high = mid-1;
                    else{
                        low = mid+1;
                        ans = mid;
                    }
               }
                return ans;
            }
            
}

