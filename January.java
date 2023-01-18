
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
        boolean res = math.palindrom(21);
        System.out.println(res);
    }

}
