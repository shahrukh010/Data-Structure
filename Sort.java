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

    private void swap(int[]input, int i, int j){

        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

}
