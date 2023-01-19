
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


                private int hoars(int[]input,int low, int high){

                    int pivot = input[low];

                    int left = low;
                    int right = high;

                    while(left< right){

                        while(left < input.length && input[left]<=pivot) left++;
                        while(input[right] >pivot)right--;

                        if(left < right)swap(input,left++,right--);
                    }

                    input[low] = input[right];
                    input[right] = pivot;
                    return right;
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

                                int pivot = hoars(input,low,high);
                                quickSort(input,low,pivot);
                                quickSort(input,pivot+1,high);

                            }
                        }
                                            

                                    public void unionFromSortedArray(int[]a,int[]b){

                                        int i=0;
                                        int j = 0;
                                        int m = a.length-1;
                                        int n = b.length-1;

                                        while(i<=m && j <=n){

                                            if(i > 0 && a[i] == a[i-1]){
                                                i++;
                                                continue;
                                            }
                                            if(j > 0 && b[j] == b[j-1]){
                                                j++;
                                                continue;
                                            }

                                            if(a[i] < b[j])
                                                System.out.print(a[i++]+",");
                                            else if(a[i] > b[j])
                                                System.out.print(b[j++]+",");
                                            else{
                                                System.out.print(a[i]+",");
                                                i++;
                                                j++;
                                            }
                                        }

                                        while(i<=m){
                                            if(i>0 && a[i] !=a[i-1])
                                                System.out.print(a[i]+",");
                                            i++;
                                        }
                                        while(j<=n){
                                            if(j>0 && b[j] !=b[j-1])
                                                System.out.print(b[j]+",");
                                            j++;
                                        }

                                    }



                                    //it takes o(n2)
                                    public void common(int[]a,int[] b){

                                        for(int i = 0; i < a.length;i++){

                                            if(i > 0 && a[i] == a[i-1])continue;
                                            for(int j = 0; j < b.length; j++){

                                                if(a[i] == b[j]){
                                                    System.out.print(a[i]+",");
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    //optimze version of common nlogn simlar to merge sort
                                    public void intersection(int[]a,int[]b){

                                        int i = 0;
                                        int j = 0;
                                        int m = a.length-1;
                                        int n = b.length-1;

                                        while(i<=m && j <=n){

                                            if(i>0 && a[i] == a[i-1]){
                                                i++;
                                                continue;
                                            }
                                            if(a[i] == b[j]){
                                                System.out.print(a[i]+",");
                                                i++;
                                                j++;
                                            }
                                            if(a[i] < b[j])
                                                i++;
                                            else
                                                j++;
                                    }
                                  }



                                                                                        
                                                                    public void merge(int[]input,int low,int mid,int high){

                                                                        int i = low;
                                                                        int j = mid+1;
                                                                        int k = low;
                                                                        int[] merge = new int[input.length];

                                                                        while(i<=mid && j<=high){

                                                                            if(input[i]<input[j])
                                                                                merge[k++] = input[i++];
                                                                            else
                                                                                merge[k++] = input[j++];
                                                                        }

                                                                        for(;i<=mid;i++)
                                                                            merge[k++] = input[i];
                                                                        for(;j<=high;j++)
                                                                            merge[k++] = input[j];

                                                                        for(int x = low; x <=high;x++)
                                                                            input[x] = merge[x];

                                                                    }

                                                                    public void mergeSort(int[]input,int low, int high){

                                                                        if(high > low){

                                                                            int mid = (low +(high - low)/2);

                                                                            mergeSort(input,low,mid);
                                                                            mergeSort(input,mid+1,high);
                                                                            merge(input,low,mid,high);
                                                                        }
                                                                    }



                                                                    public void merge(int[]a,int[]b){

                                                                        int m = a.length-1;
                                                                        int n = b.length-1;
                                                                        int i = 0;
                                                                        int j = 0;
                                                                        int[] merge = new int[a.length + b.length];
                                                                        int k = 0;
                                                                        while(i<=m && j<=n){

                                                                            if(a[i] < b[j])
                                                                                merge[k++] = a[i++];
                                                                            else
                                                                                merge[k++] = b[j++];
                                                                        }
                                                                        for(;i<=m;i++)
                                                                            merge[k++] = a[i];

                                                                        for(;j<=n;j++)
                                                                            merge[k++] = b[j];
                                                                        System.out.println(java.util.Arrays.toString(merge));
                                                                    }


                                                                    public void insertionSort(int[]input){


                                                                        for(int index = 1; index < input.length; index++){

                                                                            int tmp = input[index];
                                                                            int j = index-1;

                                                                            while(j>=0 && tmp<input[j]){

                                                                                input[j+1] = input[j];
                                                                                j--;
                                                                            }
                                                                            input[j+1] = tmp;

                                                                        }
                                                                    }


                                                                    public void selectionSort(int[]input){


                                                                        for(int i = 0; i < input.length; i++){

                                                                            int k = i;
                                                                            for(int j = i+1; j < input.length; j++){

                                                                                if(input[k] > input[j])
                                                                                    k = j;
                                                                            }
                                                                            swap(input,i,k);
                                                                        }

                                                                    }

                                                                    public void bubble(int[]input){

                                                                        for(int index = 0; index < input.length; index++){

                                                                            for(int j = 0; j < input.length-index-1;j++){

                                                                                if(input[j] > input[j+1])swap(input,j,j+1);
                                                                            }

                                                                        }

                                                                    }


                            public int minDiffArray(int[]input){

                                int res = Integer.MAX_VALUE;
                                for(int i = 0; i < input.length; i++){

                                    for(int j = i+1; j < input.length;j++){

                                         res = java.lang.Math.min(java.lang.Math.abs(input[i]-input[j]),res);
                                        
                                    }
                                }
                                return res;
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

                            for(int i = 2 ; i*i<=n ;i++){
                                
                                if(n%i==0)return false;
                            }
                            return true;

                        }



                        public void primeFactor(int n){

                            for(int i = 2; i <=n; i++){

                                if(isPrime(i)){

                                    int x = i;
                                    while(n%x==0){
                                        System.out.print(i+",");
                                        x = x*i;
                                    }
                                }
                            }
                        }


                        public void printAllPrime(int n){

                            boolean[] flag = new boolean[n+1];

                            for(int i = 2; i*i <=n; i++){

                                if(isPrime(i)){

                                    int x = 2*i;
                                    while(x <= n){

                                        flag[x] = true;
                                        x  = i+x;
                                    }
                                }
                            }

                            for(int index = 2;index<flag.length;index++)
                                if(!flag[index])
                                    System.out.print(index+",");

                        }

                        //optimze of primeFactor
                        public void primeFactorization(int n){

                            for(int i=2; i*i<=n; i++){

                                while(n% i==0){
                                    System.out.print(i+",");
                                    n = n/i;
                                }
                            }
                            if(n>1)
                                System.out.print(n);
                        }

                        public void allDivisor(int n){

                            int i =0;
                            for(i = 1; i*i<n; i++){

                                if(n%i==0)System.out.print(i+",");
                            }

                            for(;i>0;i--)
                                if(n%i==0)
                                    System.out.print(n/i+",");

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

//         math.primeFactor(84);
         //math.primeFactor(12);
//         math.primeFactor(13);
//         math.primeFactorization(315);
    //         math.primeFactor(315);
        //math.allDivisor(15);
//        math.allDivisor(100);
//        math.printAllPrime(10);
        math.printAllPrime(23);
         System.out.println();

//        int[] input = {10,4,5,8,11,6,26};
        //int[] input = {10,5,30,12};
        //int[] input = {30,20,5,10,8};
 //       int result = sort.kthSmallestElement(input,0,input.length-1,4);
//        System.out.println(result);
//        int[] input = {5,3,1,0,2,4};
//        int[] input = {5,3,8,4,2,7,1,10};
//        sort.quickSort(input,0,input.length-1);
//        System.out.println(java.util.Arrays.toString(input));
//        int[] a = {4,4};
 //       int[] b = {2,3,3,4,4};
//        sort.unionFromSortedArray(a,b);
        int[] a = {3,5,10,10,10,15,15,20};
       int[] b = {5,10,10,15,30};

       sort.merge(a,b);
//        sort.common(a,b);
//        sort.intersection(a,b);

   //     int[] input = {10,5,30,15,7};
//        sort.mergeSort(input,0,input.length-1);
 //       System.out.println(java.util.Arrays.toString(input));
  //      System.out.println();

       //int[] input = {20,5,40,60,10,30,0};
       //int[] input = {5,3,2,1,0,7,5,9,8,6};
  //     int[] input = {5,0,3,2,2,1,0,7,5,9,8,7,6};
//       sort.insertionSort(input);
//       sort.selectionSort(input);
 //      sort.bubble(input);
//       System.out.println(java.util.Arrays.toString(input));
       //int[] input = {1,8,12,5,18};
       int[] input = {8,-1,0,3};
       int res = sort.minDiffArray(input);
       System.out.println(res);
    }

}
