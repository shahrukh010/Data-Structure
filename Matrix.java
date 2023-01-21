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



    public void sneakPattern(int[][]input){


        for(int i = 0; i < input.length; i++){

            if(i%2==0)
                for(int j = j = 0; j < input[i].length; j++)
                    System.out.print(input[i][j]+",");
            else
                for(int j = input.length-1; j >=0; j--)
                    System.out.print(input[i][j]+",");
        }
    }
}
