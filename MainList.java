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


    /*
        list.add(12);
        list.add(99);
        list.add(37);
        list.add(8);
        list.add(0);
        list.add(18);
        list.add(18);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(0);
        */
        //LinkedList.Node node = list.getNode();
        
        //LinkedList.Node res = list.rotateClockWise(node,1);
        //printNode(res);
//        LinkedList.Node res = list.rotateAntiClock(node,5);
//        printNode(res);
//        System.out.println();

//        LinkedList.Node res = list.reverseRecursive(node);
 //       printNode(res);
  //      System.out.println();

//        LinkedList.Node res = list.mergeSort(node);
//        printNode(res);



   /*
    * In this case first sort list1 and list 2 then only you can merge using merge function
    * for sotring each list you can follow merge sort algorithm then mergelist and result will be sorted.
    *
    */

    /*
    list.add(12);
    list.add(9);
    list.add(37);
    LinkedList.Node node1 = list.getNode();

    LinkedList list2 = new LinkedList();

    list2.add(45);
    list2.add(8);
    LinkedList.Node node2 = list2.getNode();

    LinkedList.Node res = list.mergeList(node1,node2);

    printNode(res);
    */


    //merge two sorted list;
    LinkedList list1 = new LinkedList();
               list1.add(1);
               list1.add(4);
               list1.add(5);
               list1.add(9);
               list1.add(10);
    LinkedList list2 = new LinkedList();
               list2.add(2);
               list2.add(3);
               list2.add(6);
               list2.add(7);
               list2.add(8);

    LinkedList.Node node1 = list1.getNode();
    LinkedList.Node node2 = list2.getNode();

    LinkedList.Node res = list.mergeTwoSortedList(node1,node2);
    printNode(res);
    System.out.println();

    }
}
