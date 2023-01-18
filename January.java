
class Math{


    public int countDigit(int n){

        int res = 0;
        while(n!=0){

            res++;
            n = n/10;
        }
        return res;
    }


    public boolean palindrom(int n){

        int res = 0;
        int tmp = n;

        while(tmp !=0){

            res = res * 10 + tmp % 10;
            tmp = tmp/10;
        }
        return n==res;
    }

    public int factorial(int n){

        int res = 1;
        while( n !=0 && n !=1){

            res *= n;
            n--;
       }
        return res;
    }



        
        

            public int trailingZero(int n){

                int res = 0;
                /**
                 * this logi is not working for high no of factorial like 20,it given 19 digit
                 * and 19 digit can not hold it data type or same like 251
                 */
                /*
                int fact = factorial(n);
                while(fact % 10 ==0){
                    res++;
                    fact = fact / 10;
                }
                */

                for(int i = 5; i <=n; i=i*5){
                    res +=  n/i;
                }
                return res;
            }

            public int gcd(int a, int b){

                int min = java.lang.Math.min(a,b);

                while(min>0){

                    if(a % min == 0 && b % min ==0)return min;
                    min--;
            }
            return 1;
            }

}
        
public class January{

    public static void main(String...strings){
        Math math = new Math();
        //int res = math.countDigit(9235);
        //int res = math.countDigit(38);
//        int res = math.countDigit(3);
 //       System.out.println(res);

        //boolean res = math.palindrom(78987);
        //boolean res = math.palindrom(121);
        //boolean res = math.palindrom(8);
       // boolean res = math.palindrom(21);
        //System.out.println(res);
//        int res = math.factorial(5);
 //       int res = math.factorial(6);
//        int res = math.factorial(0);
 //       System.out.println(res);

//        int res = math.trailingZero(5);
       // int res = math.trailingZero(10);
//        int res = math.trailingZero(24);
//        int res = math.trailingZero(251);
 //       System.out.println(res);

        //int res = math.gcd(10,15);
        int res = math.gcd(13,15);
        System.out.println(res);
    }

}
