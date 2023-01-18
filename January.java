
class Sorting{


    private void swap(int[]input,int i, int j){

        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    private int partitionByLomuto(int[]input,int low,int high){

        int i = low-1;
        int pivot = input[high];

        for(int j = low; j <input.length; j++){

            if(input[j]<pivot){

                i++;
                swap(input,i,j);
            }
        }
        swap(input,i+1,high);
        return i+1;
    }


        public int kthSmallestElement(int[]input,int low ,int high,int k){

            while(low<=high){

                int pivot = partitionByLomuto(input,low,high);

                if(pivot == k-1)
                        return input[pivot];

                else if(pivot > k-1)
                    high = pivot-1;
                else
                    low = pivot+1;
            }
            return -1;
        }


                        private int lomuto(int[]input,int low,int high){

                            int i = low-1; 
                            int pivot = input[high];

                            for(int j = low ; j < input.length; j++){

                                if(input[j] < pivot){
                                    i++;
                                    swap(input,i,j);
                                }
                            }
                            swap(input,i+1,high);
                            return i+1;
                        }
                                                
                        public void quickSort(int[]input,int low,int high){

                            if(low < high){

                                int pivot = lomuto(input,low,high);
                                quickSort(input,low,pivot-1);
                                quickSort(input,pivot+1,high);
                            }
                        }
}
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

            public int lcm(int a, int b){

                int res = java.lang.Math.max(a,b);

                while(true){

                    if(res % a == 0 && res % b==0)return res;
                    res++;
            }
            }

                                        

                        public boolean isPrime(int n){

                            for(int i = 2 ; i*i<n ;i++){
                                
                                if(n%i==0)return false;
                            }
                            return true;

                        }
}
        
public class January{

    public static void main(String...strings){
        Math math = new Math();

        Sorting sort = new Sorting();
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
//        int res = math.gcd(13,15);
 //       System.out.println(res);

        //int res = math.lcm(4,6);
        //int res = math.lcm(12,15);
//        int res = math.lcm(2,8);
 //       System.out.println(res);

//        boolean res = math.isPrime(13);
 //       System.out.println(res);


        //int[] input = {10,4,5,8,11,6,26};
        //int[] input = {10,5,30,12};
        int[] input = {30,20,5,10,8};
 //       int result = sort.kthSmallestElement(input,0,input.length-1,4);
//        System.out.println(result);
        sort.quickSort(input,0,input.length-1);
        System.out.println(java.util.Arrays.toString(input));


    }

}
