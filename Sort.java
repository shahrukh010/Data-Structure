package com.code.sort;

public class Sort {


    public void bubble(int[]input){


        for(int index = 0; index < input.length; index++){

            for(int j = 1; j < input.length - index; j++){

                if(input[j-1] > input[j])

                    swap(input,j-1,j);
            }

        }
    }


    public void selection(int[]input){

        for(int index = 0 ; index < input.length; index++){

            int q = index;
            for(int j = index+1; j < input.length; j++){

                if(input[q] > input[j])
                    q = j;
            }
            swap(input,index,q);
        }
    }


    public void insertion(int[] input){


        for(int index = 1; index < input.length; index++){

            int tmp = input[index];
            int j = index-1;

            while(j>=0 && input[j] > tmp){

                input[j+1] = input[j];
                j--;
            }
            input[j+1] = tmp;
        }

    }


    public int[] mergeTwoSortedArray(int[]a,int[]b){

        int i = 0;
        int j = 0;

        int[] merge = new int[a.length + b.length];
        int k = 0;

        while(i<=a.length-1 && j<=b.length-1){

            if(a[i] <b[j])
                merge[k++] = a[i++];
            else
                merge[k++] = b[j++];
        }

        for(; i<a.length;i++)
            merge[k++] = a[i];

        for(; j<b.length;j++)
            merge[k++] = b[j];

        return merge;
    }
    public void merge(int[]input,int low, int mid, int high){

        int i = low;
        int j = mid+1;

        int[] merge = new int[input.length];
        int k = low;

        while(i<=mid && j<=high){

            if(input[i] < input[j])
                merge[k++] = input[i++];
            else
                merge[k++] = input[j++];
        }

        for(; i<=mid;i++)
            merge[k++] = input[i];

        for(; j<=high; j++)
            merge[k++] = input[j];

        for(int index = low; index<=high;index++)
            input[index] = merge[index];
//        return merge;
    }


    public int[] mergeSort(int[]input,int low ,int high){


        if(high > low){

            int mid = (low+(high - low)/2);//same as low+high/2 becase of overflow low+(high-low)/2 taking mergeSort,and binarySrch

            mergeSort(input,low,mid);
            mergeSort(input,mid+1,high);
            merge(input,low,mid,high);
        }
//        System.out.println(java.util.Arrays.toString(input));
        return input;
    }


    public void common(int[]a,int[]b){


        //oN2
        
        /*
        for(int index = 0; index < a.length; index++){

            if(index ==0 || a[index] !=a[index-1]){

            for(int j = 0; j < b.length;j++){

                if(a[index] == b[j]){
                    System.out.print(a[index]+",");
                    break;
                }
            }
          }
        }*/

        int i = 0;
        int m = a.length;
        int j = 0;
        int n = b.length;

        while(i<m && j < n){
        if(i > 0 && a[i] ==a[i-1]){
            i++;
            continue;//remaining element will be not executed
        }

        if(a[i] < b[j])i++;

        else if (a[i] > b[j])j++;

        else{
            System.out.print(a[i]+",");
            i++;
            j++;
        }
      }
    }

            public void union(int[]a,int[]b){

                int i = 0;
                int j = 0;
                int m = a.length;
                int n = b.length;

                while(i < m && j < n){

                    if(i > 0 && a[i] == a[i-1]){
                        i++;
                        continue;
                    }

                    if(j > 0 && b[j] == b[j-1]){
                        j++;
                         continue;
                    }

                    if(a[i] < b[j]){
                        System.out.print(a[i]+",");
                        i++;
                    }
                    else if(a[i] > b[j]){
                        System.out.print(b[j]+",");
                        j++;
                    }
                    else{
                        System.out.print(b[j]+",");
                        i++;
                        j++;
                    }
                }

                while(i<m && a[i] !=a[i-1])
                  System.out.print(a[i++]+",");
                while(j<n && b[j] !=b[j-1])
                    System.out.print(b[j++]+",");
            }


            public int countInversion(int[]input){

                int res = 0;

                for(int index = 0; index < input.length; index++){


                    for(int j = index+1; j < input.length; j++){

                        if(input[index] > input[j])
                            res++;
                    }
                }
                return res;
            }




            public void partitionByLomuto(int[]input,int low,int high){

                int pivot = input[high];//standard lomuto partion say that pivot is always last element.

                int i = low-1;

                for(int j = low; j <= high-1; j++){

                    if(input[j] < pivot){

                        i++;
                        swap(input,i,j);
                    }
                }
                swap(input,i+1,high);
            }


            public int partitionByHoars(int[]input){

                int pivot = input[0];
                int i = -1;
                int j = input.length;

                while(true){
                do{
                    i++;
                }while(input[i] < pivot);
                do{
                    j--;
                }while(input[j] > pivot);

                if(i>=j)return j;

                swap(input,i++,j--);
               }
            }




            private int partition(int[]input,int low, int high){

                //lomuto partition for quick sort
                int i = low-1;
                int pivot = high;

                for(int index = low; index < input.length; index++){

                    if(input[index] < input[high]){
                        i++;
                        swap(input,i,index);
                    }
                }
                swap(input,i+1,pivot);
                return i+1;
            }

            private int partitionHoars(int[]input, int low ,int high){

                int pivot = low;
                int i = low-1;
                int j = high+1;

                while(true){

                do{
                    i++;
                }while(input[i] < input[pivot]);

                do{
                    j--;
                }while(input[j] > input[pivot]);

                if(i>=j)return j;
                swap(input,i++,j--);
            }
          }

            public void quickSort(int[]input,int low, int high){

                
                if(low < high){

                //using lomuto
                    /*
                     
                    int pivot = partition(input,low,high);
                    quickSort(input,low,pivot-1);
                    quickSort(input,pivot+1,high);

                    */

                    int pivot = partitionHoars(input,low,high);
                    quickSort(input,low,pivot);
                    quickSort(input,pivot+1,high);
                }
            }


            private int pivotLomuto(int[]input,int low ,int high){

                int i = low-1;
                int pivot = high;

                for(int index = low ;index < input.length ; index++){

                    if(input[index] < input[pivot]){
                        i++;
                        swap(input,i,index);
                    }
                }
                swap(input,i+1,pivot);
                return i+1;
            }

            public int kthSmallestElement(int[]input,int k){

                int low = 0;
                int high = input.length-1;
                
                while(low<=high){

                    int pivot = pivotLomuto(input,low,high);

                    if(pivot == k-1)
                        return input[pivot];

                    if(pivot > k-1)
                        high = pivot-1;
                    else
                        low = pivot+1;
                }
                return -1;
            }




    private void swap(int[]input, int i, int j){

        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }
}
