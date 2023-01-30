import com.code.main.list.LinkedList;

public class MainList{


    public static void main(String...strings){

    LinkedList list = new LinkedList();
            
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.printNode();
        System.out.println(list.getSizeOfList());

    }
}
