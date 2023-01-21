package com.code.matrix;

public class Matrix{


    public void jaggedMatrix(){

        int m = 3;
        int[][] input = new int[m][];

        for(int index = 0; index < input.length; index++){

            input[index] = new int[index+1];

            for(int j = 0; j < input[index].length;j++){

                input[index][j] = index;
                System.out.print(input[index][j]+",");
            }
            System.out.println();
        }
    }
}
