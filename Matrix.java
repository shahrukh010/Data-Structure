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


    public boolean searchFromSortedMatrix(int[][]input,int target){

        int low = 0;
        int r = input[0].length;
        int high = ((input.length * input[0].length));

        while(low < high){

            int mid = (low + high)/2;
//            int mid = (low + (high - low)/2);

            int col = mid / r;
            int row = mid % r;

            if(input[col][row] == target)return true;

            if(input[col][row] < target)
                low = low+1;
            else
                high = high-1;
        }
        return false;
    }


    public int medianFromMatrix(int[][]input){

        //using binary search
        
        int r = input.length;
        int c = input[0].length;
        int min = input[0][0];
        int max = input[0][c-1];
        

        for(int i= 1; i < r; i++){
            min = Math.min(input[i][0],min);
            max = Math.max(input[i][c-1],max);
        }

        int medPos = ((r * c+1)/2);

        while(min < max){

            int mid = ((min + max)/2);

            int midPos = 0;

            for(int i = 0; i < r; i++){

                int pos = java.util.Arrays.binarySearch(input[i],mid)+1;
                midPos +=Math.abs(pos);
            }

            if(midPos < medPos)
                min = mid+1;
            else
                max = mid;
        }
        return min;
    }
}
