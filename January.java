

class Matrix{


    public boolean searchFromMatrix(int[][]input,int target){


        int i = 0;
        int r = input.length;
        int j = input[0].length-1;

        while(i < r && j >=0 ){

            if(input[i][j] == target)return true;

            if(input[i][j] > target)j--;
            else
                i++;
        }

        return false;
    }

    public void sneakPattern(int[][]input){

        int r = input.length;
        int c = input[0].length-1;

        for(int i = 0; i < r ; i++)
            if(i % 2 == 0)
                for(int j = 0; j < r; j++)
                    System.out.print(input[i][j]+",");
            else
                for(int j = c; j>=0;j--)
                    System.out.print(input[i][j]+",");
    }


    public void boundaryTraversal(int[][]input){

        int top = 0;
        int bottom = input.length-1;
        int left = 0;
        int right = input[0].length-1;


        for(int i = left; i <=right; i++)
            System.out.print(input[top][i]+",");
        top++;

        for(int i=top;i<=bottom;i++)
            System.out.print(input[i][right]+",");
        right--;

        for(int i = right;i>=left;i--)
            System.out.print(input[bottom][i]+",");
        bottom--;

        for(int i = bottom; i>=top;i--)
            System.out.print(input[i][left]+" ");
    }

    public void transpose(int[][]input){

        int r = input.length;
        int c = input[0].length;

        for(int i = 0; i < c; i++){

            for(int j = 0; j < r; j++)
                System.out.print(input[j][i]+",");
            System.out.println();
        }
    }

    public void rotate90(int[][]input){

        int r = input.length;
        int c = input[0].length-1;

        for(int col = c; col >=0 ; col--){

            for(int row = 0; row < r; row++)
                System.out.print(input[row][col]+",");
        System.out.println();
        }

    }
    public void spiralTraversal(int[][]input){

        int top =0;
        int bottom = input.length-1;
        int right = input[0].length-1;
        int left = 0;

        while(top <= bottom && left <=right){

            for(int i = left; i <=right; i++)
                System.out.print(input[top][i]+",");
            top++;

            for(int i = top; i <=bottom; i++)
                System.out.print(input[i][right]+",");
            right--;

            if(top<=bottom){

                for(int i = right;i>=left;i--)
                    System.out.print(input[bottom][i]+",");//start from right-1 because of right is already printed
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i>=top; i--)
                    System.out.print(input[i][left]+",");
                left++;
            }
        }
    }
    public int medianFromMatrix(int[][]input){

        int r = input.length;
        int c = input[0].length;

        int min = input[0][0];
        int max = input[0][c-1];

        for(int i = 1; i < r; i++){

            min = java.lang.Math.min(input[i][0],min);
            max = java.lang.Math.max(input[i][c-1],max);
        }

        int medPos = ((r * c + 1)/2);

        while(min < max){

            int mid = ((min + max)/2);
            int midPos = 0;

            for(int i = 0; i < r; i++){
                int pos = java.util.Arrays.binarySearch(input[i],mid)+1;
                 midPos +=java.lang.Math.abs(pos);
            }
        if(midPos < medPos)
            min = mid+1;
        else
            max = mid;
        }

        return min;
    }

}

class Searching{



    //it takes O(n2)but not modifying array
    //you can use nlogn also just sort array
    //or you can use hashtable also but it takes o(n)s(n)
    public int repeatElement(int[]input){

        for(int index = 0; index < input.length; index++){

            for(int j = index+1; j < input.length; j++){

                if(input[index]==input[j])return input[index];
        }
    }
    return -1;
    }

    //it take o(n)without modifying array
    public int findRepeat(int[]input){

        int slow = input[0];
        int fast = input[0];

        do{
            slow = input[slow];
            fast = input[input[fast]];
        }while(slow !=fast);
        
        slow = input[0];

        while(slow !=fast){

            slow = input[slow];
            fast = input[fast];
        }
        return slow;
    }


   public int median(int[]a,int []b){

       int i = 0;
       int j = 0;
       int m = a.length-1;
       int n = b.length-1;

       int[] merge = new int[m+n+2];
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

       //System.out.println(java.util.Arrays.toString(merge));

       int nn = merge.length;
       int ans = 0;
       int mid = 0;

       if(nn%2 !=0){

           mid = nn/2;
           ans = merge[mid];
       }
       else{

           mid = nn/2;
           ans = ((merge[mid] + merge[mid-1])/2);
       }
       return ans;
       }


                                    //it takes O(n3)
                                    public boolean isTriplet(int[]input,int target){

                                        for(int i = 0; i < input.length-2; i++){
                                            for( int j = i+1; j < input.length-1; j++){

                                                for(int k = j+1; k < input.length; k++){

                                                    int sum = input[i] + input[j] + input[k];
                                                    if(target == sum)return true;
                                                }
                                            }
                                        }
                                        return false;
                                    }

                                    //it takes o(nlogn)
                                    public boolean triplet(int[]input,int target){

                                        for(int index = 0; index < input.length; index++){

                                            int ntf = target - input[index];

                                            int start = index+1;
                                            int end = input.length-1;

                                            while(start<end){

                                                int sum = input[start] + input[end];
                                                if(ntf == sum)
                                                    return true;

                                                if(sum > ntf)
                                                    end--;
                                                else
                                                    start++;
                                            }

                                        }
                                        return false;
                                    }


                                    public boolean isExistPairInSorted(int[]input,int target){

                                        int start = 0;
                                        int end = input.length-1;

                                        while(start < end){

                                            int sum = input[start]+input[end];
                                            if(target == sum)return true;

                                            if(sum > target)end--;
                                            else
                                                start++;
                                        }
                                        return false;
                                    }


                                    public int peak(int[]input){

                                        int low = 0;
                                        int high = input.length-1;

                                        while(low <= high){

                                            int mid = (low + (high - low)/2);

                                            if(mid==0 || mid==input.length-1
                                               || input[mid] > input[mid-1] && input[mid]>input[mid+1])
                                                return input[mid];

                                            if(input[mid] > input[mid+1])
                                                high = mid-1;
                                            else
                                                low = mid+1;
                                        }
                                        return -1;
                                    }


                                    public int searchFromSortedRotatedArray(int[]input,int target){

                                        int low = 0;
                                        int high = input.length-1;

                                        while(low<=high){

                                            int mid = (low +(high - low)/2);

                                            if(input[mid] == target)return target;

                                            if(input[low] < input[mid]){

                                                if(target >=input[low] && target < input[mid])
                                                    high = mid-1;
                                                else
                                                    low = mid+1;
                                            }
                                            else{
                                                if(target > input[mid] && target <= input[high])
                                                    low = mid+1;
                                                else
                                                    high = mid-1;

                                            }
                                        }
                                        return -1;
                                    }

                                    private int binarySearch(int[]input, int low ,int high,int target){

                                        while(low<=high){

                                            int mid = (low + (high - low)/2);
                                            if(input[mid] == target)return target;

                                            if(input[mid] > target)
                                                high = mid-1;
                                            else
                                                low = mid+1;
                                        }
                                        return -1;
                                    }

                                    public int searchFromInfinit(int[]input,int target){

                                        if(input[0]==target)return target;

                                        int x = 1;
                                        while(input[x]<target){

                                            x = x*2;
                                        }
                                        if(input[x] == target)return target;
                                        return binarySearch(input,x/2+1,x,target);
                                    }


                                    public int squareRoot(int n){

                                        int low = 0;
                                        int high = n;
                                        int ans = 0;

                                        while(low < high){

                                            int mid = ((low+high)/2);
                                            int msq = mid*mid;

                                            if(msq == n)return mid;

                                            if(msq > n){
                                                high = mid-1;
                                            }
                                            else{
                                                ans = mid;
                                                low = mid+1;
                                            }
                                        }
                                        return ans;
                                    }

                                    private int firstOccurenceIndex(int[]input){

                                        int low = 0;
                                        int high = input.length;

                                        while( low < high){
                                            
                                            int mid = (low + ( high - low)/2);

                                            if(input[mid]==1){

                                                if(mid ==0 || input[mid-1] !=1)
                                                    return mid;
                                                high = mid-1;
                                            }

                                            else
                                                low = mid+1;
                                        }
                                        return -1;
                                    }


                                    public int count1s(int[]input){

                                        
                                        int n = input.length;
                                        int index =  firstOccurenceIndex(input); 

                                        return index !=-1 ? n - index : 0;
                                    }

                                    public int lastIndex(int[]input,int target){

                                        int low = 0;
                                        int high = input.length-1;

                                        while(low <= high){

                                            //int mid = ((low + high)/2);//(low + (high - low)/2);
                                            int mid = (low + (high - low)/2);
                                            if(input[mid]==target){
                                                if(mid == input.length-1 || input[mid] !=input[mid+1])
                                                    return mid;
                                                low = mid+1;
                                            }
                                            else if(input[mid] > target)
                                                high = mid-1;

                                            else
                                                low = mid+1;
                                        }
                                        return -1;
                                    }


                                    /*
                                    public int lastIndex(int[]input,int target){

                                        int low = 0;
                                        int high = input.length-1;
                                        
                                        while(low<=high){

                                            int mid = ((low + high)/2);

                                            if(input[mid] < target)
                                                low = mid+1;
                                            else if(input[mid]> target)
                                                high = mid-1;
                                            else
                                                if(mid == input.length-1 || input[mid] !=input[mid+1])
                                                    return mid;
                                                else
                                                    low = mid+1;
                                        }
                                        return -1;
                                    }*/
}



class Sorting{



    public int[][] mergeOverlapping(int[][]input){

        java.util.List<int[]> res = new java.util.ArrayList<>();
        int start = input[0][0];
        int end = input[0][1];

        for(int[] inv : input){

            if(inv[0]<=end){
                end = java.lang.Math.max(end,inv[1]);
            }
            else{
                res.add(new int[]{start,end});
                start = inv[0];
                end = inv[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
    protected void swap(int[]input,int i, int j){

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
                                //it takes o(n2)
                                /*
                                for(int i = 0; i < input.length; i++){

                                    for(int j = i+1; j < input.length;j++){

                                         res = java.lang.Math.min(java.lang.Math.abs(input[i]-input[j]),res);
                                        
                                    }
                                }*/

                                java.util.Arrays.sort(input);//arrange element closest to each other

                                    for(int i = 1 ; i < input.length;i++)
                                        res = java.lang.Math.min(java.lang.Math.abs(input[i] - input[i-1]),res);
                                return res;
                            }


                            public int chocolcateDistribution(int[]input,int m){

                                java.util.Arrays.sort(input);
                                int res = Integer.MAX_VALUE;

                                for(int i = 0; i+m-1<=input.length-1; i++){

                                    int min = input[i];
                                    int max = input[i+1];
                                    for(int j = 2; j <=m-1;j++){

                                         max = java.lang.Math.max(max,input[j+i]);
                                    }
                                    res  = java.lang.Math.min(res,max - min);
                                }
                                return res;
                            }

                            public void segrateAllNegativeLeft(int[]input){

                                int i = -1;
                                for(int j=0;j<input.length;j++){

                                    if(input[j]<0){
                                        i++;
                                        swap(input,i,j);
                                    }
                                }
                            }

                            public void segrateEvenOdd(int[]input){

                                int i = -1;
                                for(int index = 0; index < input.length; index++){

                                    if(input[index] % 2==0){
                                        i++;
                                        swap(input,i,index);
                                    }
                                }

                            }

                            public void segrateZero(int[]input){

                                int i = -1;
                                for(int index = 0; index < input.length;index++){

                                    if(input[index]<=0){
                                        i++;
                                        swap(input,i,index);
                                    }
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



class Array extends Sorting{


                public int largeElement(int[]input){

                    int res = 0;
                    for(int i=0; i < input.length; i++){
                        res = java.lang.Math.max(input[i],res);
                    }
                    return res;
                }

                public int secondLarge(int[]input){

                    int res = -1;
                    int lg = 0;
                    
                    for(int i = 1; i < input.length; i++){

                        if(input[i] > input[lg]){
                            res = lg;//it point to second large element till now
                            lg = i;
                        }
                        else{
                            if(input[i]!=input[lg]){

                                if(res == -1 || input[i] > input[res])
                                    res = i;
                            }
                        }
                    }
                    return input[res];
                }

                public void reverse(int[]input){

                    int i =0;
                    int j = input.length-1;
                    while(i<j){

                        swap(input,i++,j--);
                    }
                }

                //without modify array it takes o(n)s(1)
                public void removeDuplicate(int[]input){

                    int i = 0;

                    for(int j = 1; j < input.length; j++){

                        if(input[j] !=input[j-1]){
                            input[i+1] = input[j];
                            i++;
                        }
                    }
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
//       int[] input = {1,8,12,5,18};
      // int[] input = {8,-1,0,3};
//       int[] input = {10};
//       int res = sort.minDiffArray(input);
//       int[] input = {7,3,2,4,9,12,56};
//       int[] input = {3,4,1,9,56,7,9,12};
//       int[] input = {7,3,1,8,9,12,56};
//      int res = sort.chocolcateDistribution(input,3); 
//       int[] input = {15,-3,-2,18};
//       int[] input = {-2,3,-1,6,-3,7,0};
//       int[] input = {15,14,13,12};
//                  sort.segrateAllNegativeLeft(input);
//                    sort.segrateEvenOdd(input);
//       int[] input = {0,1,1,0,1,0,1};
 //                   sort.segrateZero(input);
  //     System.out.println(java.util.Arrays.toString(input));






       System.out.println("==============================");
       System.out.println("==============================");
       System.out.println("==============================");
       Array array = new Array();
       //int[] input = {10,5,20,8};
       //int[] input = {40,8,50,100};
       //int res = array.largeElement(input);
       //int[] input = {20,10,20,8};
  //     int[] input = {5,20,12,20,8};
   //    int res = array.secondLarge(input);
//       System.out.println(res);

 //      array.reverse(input);
//       System.out.println(java.util.Arrays.toString(input));

       //int[] input = {10,20,20,30,30,30};
  //     int[] input = {10,20,20,30,30,30,40};
//       array.removeDuplicate(input);
 //      System.out.println(java.util.Arrays.toString(java.util.Arrays.copyOfRange(input,0,4)));






       Searching search = new Searching();
//       int[] input = {1,3,2,4,6,5,7,3};
//       int res = search.repeatElement(input);
 //      int res = search.findRepeat(input);
//       int[] aa = {1,2,3,4,5};
 //      int[] bb = {10,20,30,40,50,60};
//       int[] aa = {10,20,30,40,50};
//       int[] bb = {5,15,25,35,45};
//       int[] aa = {1,2,3,4,5,6};
 //      int[] bb = {10,20,30,40,50};
  //     int res = search.median(aa,bb);

//       int[] input = {2,3,4,8,9,20,40};
//       int[] input = {1,2,5,6};
       //boolean res = search.isTriplet(input,32);
//       boolean res = search.triplet(input,69);
 //      System.out.println(res);
//       System.out.println(res);
//       int[] input = {2,4,8,9,11,12,20,30};
 //        boolean res = search.isExistPairInSorted(input,51);
//       int[] input = {5,10,20,15,7};
       //int[] input = {1,10,20,15,5,23,90,60};
//       int[] input = {80,70,60};
 //      int res = search.peak(input);
  //     System.out.println(res);
//       int[] input = {10,20,40,60,5,8};
 //       int res =  search.searchFromSortedRotatedArray(input,40);
  //      System.out.println(res);

 //      int[] input = {1,10,15,20,40,80,90,100,120,500,Integer.MAX_VALUE};
//        int res = search.searchFromInfinit(input,120);
       //int res = search.squareRoot(14);
       //int res = search.squareRoot(25);
       //int res = search.squareRoot(4);
       //int res = search.squareRoot(15);
//       int res = search.squareRoot(10);
 //       System.out.println(res);


       Matrix matrix = new Matrix();
      // int[][] input = {{1,10,20},{15,25,35},{5,30,40}};
       //int res = matrix.medianFromMatrix(input);
       //System.out.println(res);
 //      int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//       matrix.spiralTraversal(input);

//       int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
//       int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
 //       matrix.rotate90(input);

//       int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//        int[][] input = {{1,2,3,4},{5,6,7,8}};
 //      matrix.transpose(input);

 //      matrix.boundaryTraversal(input);
//       int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
 //      matrix.sneakPattern(input);

//       int[][] input = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//       int[][] input = {{10,20},{12,30}};
 //      boolean res = matrix.searchFromMatrix(input,50);
  //     System.out.println(res);

       /*
       int[][] input = {{1,3,},{2,4},{5,7},{6,8}};
       int[][] res = sort.mergeOverlapping(input);

       for(int[] r : res)
           System.out.println(java.util.Arrays.toString(r));

       */
        
       //int[] input = {0,0,0,1,1,1,};
       //int[] input = {0,1,1,1,1,1,};
//       int[] input = {0,0,1};
 //      int res = search.count1s(input);
       int input[] = {10,20,20,20,30,30};
       int res = search.lastIndex(input,30);
       System.out.println(res);
    }


}
