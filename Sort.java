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

    private void swap(int[]input, int i, int j){

        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

}
