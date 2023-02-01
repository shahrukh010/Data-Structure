import com.code.main.list.LinkedList;

public class MainList{


    public static void printNode(LinkedList.Node node){

        while(node !=null){
            System.out.print(node.getData()+",");
            node = node.getNext();
        }
    }

    public static void main(String...strings){

    LinkedList list = new LinkedList();
            
    /*
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        */
        //list.printNode();
//        System.out.println(list.getSizeOfList());
//        list.reverse();
//        list.printNode();


        list.add(12);
        list.add(99);
        list.add(37);
        list.add(8);
        list.add(18);
        LinkedList.Node node = list.getNode();
        LinkedList.Node res = list.rotateAntiClock(node,1);
        printNode(res);
        System.out.println();
    }
}
