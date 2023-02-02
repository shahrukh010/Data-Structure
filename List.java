public class List{

    class Node{

        private Node next;
        private int data;

        public Node(){}

        public Node(int data){
            this.data = data;
        }
    }
    private Node first;
    private Node last;

    public Node getNode(){

        return this.first;
    }

    public void add(int data){

        Node newNode = new Node(data);

        if(this.first == null){
            this.first = newNode;
            this.last = this.first;
        }
        else{

            last.next = newNode;
            last= newNode;
        }
    }

    public Node middleNode(Node node){

        Node a = node;
        Node b = node.next;

        while(a !=null && b.next !=null){
            a = a.next;
            b = b.next;
        }
        return a;
    }

    public Node merge(Node a, Node b){

        Node temp = new Node();
        Node result = temp;

        while(a !=null && b !=null){

            if(a.data < b.data){
                temp.next = a;
                a = a.next;
            }
            else{
                temp.next = b;
                 b = b.next;
            }
            temp = temp.next;//why here because of optimze code otherwise we have to write two times 1-if and 2->else block
        }
        temp.next = (a==null)? b : a;
        return result.next;
    }

    public Node mergeSort(Node node){

        if(node == null || node.next == null)return node;

        Node middle = middleNode(node);//(n/2)/
        Node secondMiddle = middle.next;//m+1
        middle.next = null;
        return merge(mergeSort(node),mergeSort(secondMiddle));
    }

    public static void printNode(Node node){

        while(node !=null){

            System.out.println(node.data);
            node = node.next;
        }
    }

    public Node removeDuplicateItem(Node node){

        Node currentNode = mergeSort(node);
        Node current = currentNode;
        Node res = current;
        Node tmp = currentNode.next;

        while(tmp !=null){

            if(tmp.data !=current.data){

                current.next = tmp;
                current = current.next;
                tmp = tmp.next;
            }
            else{
                tmp = tmp.next;
            }
        }
        
        return res;
    }

    public static void main(String...string){

        List list = new List();
        /*
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(50);
        */

        
        /*
        list.add(18);
        list.add(8);
        list.add(34);
        list.add(13);
        list.add(34);
        list.add(8);
        list.add(37);
        */
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(6);
        

        List.Node node = list.getNode();
        //List.Node res = list.mergeSort(node);

//        System.out.println("After remove duplicate item");

        List.Node result = list.removeDuplicateItem(node);
        printNode(result);
    }
}


