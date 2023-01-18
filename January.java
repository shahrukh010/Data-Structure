
class Math{


    public int countDigit(int n){

        int res = 0;
        while(n!=0){

            res++;
            n = n/10;
        }
        return res;
    }
}
        
public class January{

    public static void main(String...strings){
        Math math = new Math();
        //int res = math.countDigit(9235);
        //int res = math.countDigit(38);
        int res = math.countDigit(3);
        System.out.println(res);
    }

}
