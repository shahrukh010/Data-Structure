package com.code.math;
public class  Mathmatics {


    public int countDigit(int n){

        int result = 1;
        while(n / 10 !=0){
            result++;
            n = n / 10;
        }
        return result;
    }

    public boolean isPalindrome(int n){

        int tmp = n;
        int res = 0;

        while(tmp !=0){

            res = res * 10 + tmp %10;
            tmp = tmp / 10;
        }
        return res == n;
    }


    public int factorial(int n){

        int res = n;

        if(n == 0)
            return 1;

        for(int index = 1; index < n; index++){

            res = res * index;
        }
        return res;
    }


    public int countTrailingZero(int n){


        int result = 0;

        if( n <=10 ){
        int resOfFact = this.factorial(n);


        while(resOfFact % 10 == 0){
            result++;
            resOfFact = resOfFact / 10;
        }

        return result;
       }

       result = 0;
       for(int index = 5; index < n; index = index * 5){

           result = result + n/index;
       }
        return result;
    }
}
