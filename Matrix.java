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



    public void boundaryTraversal(int[][]input){

        int r = input.length;
        int c = input[0].length;

        if(input.length==1)
            for(int i = 0; i < input.length; i++)
                System.out.println(input[0][i]+",");


        else if(input[0].length==1)
            for(int i = 0; i < input.length;i++)
                System.out.println(input[i][0]+",");

        else{

            for(int index = 0; index <c;index++)
                System.out.print(input[0][index]+",");

            for(int index = 1; index < r; index++)
                System.out.print(input[index][c-1]+",");

            for(int index = c-2; index>=1;index--)
                System.out.print(input[r-1][index]+",");

            for(int index = r-2; index>=1;index--)
                System.out.print(input[index][0]+",");
        }
    }




    public void transpose(int[][]input){

        for(int i = 0; i < input.length; i++){

            for(int j = 0; j < input.length;j++){

                System.out.print(input[j][i]+",");
            }
            System.out.println();
        }
    }


    public void rotate90(int[][]input){

        for(int c = input[0].length-1; c>=0; c--){

            for(int r = 0; r < input.length; r++){

                System.out.print(input[r][c]+",");
            }
            System.out.println();
        }
    }


    public void spiral(int[][]input){

        int top = 0;int bottom = input.length-1;
        int left = 0; int right = input[0].length-1;

        while(top<=right && left<=right){

        for(int i = left; i <=right; i++)
            System.out.print(input[top][i]+",");
        top++;

        for(int i = top; i <=bottom;i++)
            System.out.print(input[i][right]+",");
        right--;

        if(top<=bottom)
            for(int i = right; i>=left;i--)
                System.out.print(input[bottom][i]+",");
            bottom--;

        if(left<=right)
            for(int i = bottom;i>=top;i--)
                System.out.print(input[i][left]+",");
           left++;
        }
    }
}
