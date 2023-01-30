import com.code.hashtable.Hashtable;

public class HashMain{


    public static void main(String...strings){

        Hashtable table = new Hashtable(10);
        table.add(10);
        table.add(20);
        table.add(30);
        table.add(40);
        table.add(15);
        table.add(23);
        table.add(21);
        table.remove(21);
        table.remove(23);
//        System.out.println(table);
        boolean res = table.search(20);
        System.out.println(res);

    }

}
