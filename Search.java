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



            public int searchFromInfiniteArray(int[]input, int target){


                //it takes O(position)time
               for(int index = 0; index < input.length; index++){

                   if(input[index] == target)
                       return index;

                   if(input[index] > target)
                       return -1;
               }
               return -1;

            }

            private int search(int[]input,int low,int high, int target){

                while(low<=high){

                    int mid = (low +(high - low));

                    if(input[mid]== target)
                        return mid;

                    if(input[mid] < target){

                        low = mid+1;
                    }
                    else
                        high = mid-1;
                }
                return -1;
            }


            public int searchFromInfinite(int[]input,int target){

                if(input[0] == target)
                    return 0;

                int index = 1;

                while(index * 2 < input.length && input[index]< target){

                    index = index * 2;
                }
                if(input[index] == target){
                    return index;
                }

                /*
                 *index/2+1 because of we already check index where element was not present index-1 also not present
                 */
                return search(input,((index/2)+1),index-1,target);

            }

            public int searchFromRotatedArray(int[]input, int target){

                int low = 0;
                int high = input.length-1;

                while(low<=high){

                    int mid = (low + (high - low)/2);

                    if(input[mid] == target)
                        return mid;

                    if(input[low] < input[mid]){

                        if(target>=input[low] && target < input[mid]){
                            high = mid-1;//because of target < mid(high) in this case
                        }
                        else{

                            low = mid+1;
                        }
                    }

                    else{

                    if(target > input[mid] && target <=input[high]){

                        low = mid+1;//because of target > mid .ie mid is low
                    }
                    else
                        high = mid-1;
                   }

                }
                return -1;
            }



            public int peakElement(int[] input){

                int n = input.length;
                if(n==1)
                    return input[0];

                if(input[0] >=input[1])
                    return input[0];
                
                if(input[n-1] >=input[n-2])
                    return input[n-1];

                for(int index = 1; index < n; index++)
                    if(input[index] >=input[index-1] && input[index] >=input[index+1])
                        return input[index];
                return input[0];
            }

            public int peakBinarySearch(int[]input){

                int left = 0;
                int right = input.length-1;

                
                while(left < right){

                    int mid = (left +(right - left)/2);

                    if(mid == 0 || mid==input.length)return input[mid];

                    if(input[mid] > input[mid-1] && input[mid] > input[mid+1])
                        return input[mid];

                    else if(input[mid] < input[mid-1])
                        right = mid-1;
                        
                    else
                        left = mid+1;
                }

                return -1;

            }



            public int midElement(int[]a, int[]b){


                int[] array = new int[a.length + b.length];

                int index = 0;
                for( ; index < a.length;index++)
                    array[index] = a[index];

                for(int j = 0; j<b.length;j++)
                    array[index++] = b[j];

                java.util.Arrays.sort(array);
                System.out.println(java.util.Arrays.toString(array));

                int median = 0;
                
                if(array.length % 2 !=0) {

                   //System.out.println(median);
                    median = (array.length/2);
                    return array[median];
                }
               else{

                   median = array.length/2;
                   
                   int sum = array[median] + array[median-1];
                   return sum/2;
               }
            }


            public int repeatElement(int[]input){

                //n2
                /*
                for(int i = 0; i < input.length; i++){


                    for(int j = i+1; j < input.length; j++){

                        if(input[i] == input[j])return input[i];
                    }
                }*/

                //nlogn but it modify array
                
                /*
                java.util.Arrays.sort(input);
                for(int index = 0; index < input.length; index++){

                    if(input[index] == input[index+1])
                        return input[index];
                }*/

                //o(n)s(n)
                boolean[] visited = new boolean[input.length];

                for(int index = 0; index < input.length; index++){
                        
                    if(visited[input[index]]){

                        return input[index];
                    }

                    visited[input[index]] = true;
                }
                return -1;
            }


            public boolean isExistsTarget(int[]input, int target){


                //o(n2)
                /*
                for(int index = 0; index < input.length; index++){


                    for(int j = index+1; j < input.length; j++){

                        if(input[index] + input[j] == target)
                            return true;
                    }
            }*/

            int left = 0;
            int right = input.length-1;
            while(left < right){

                if(input[left] + input[right] == target)
                    return true;

                if(input[left] + input[right] > target)
                    right--;
                else
                    left++;
            }
            return false;
          }

}

