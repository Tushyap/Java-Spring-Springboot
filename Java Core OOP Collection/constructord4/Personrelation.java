package constructord4;
class DoublyLinkedList {    
    //A node class for doubly linked list
    class Node{  
        String name; 
        String fatherName;
        Node previous;  
        Node next;  
   
        public Node(String name, String fatherName) {  
            this.name = name;  
            this.fatherName= fatherName;
        }  
    }  
    //Initially, head and tail is set to null
    Node head, tail = null;  
   
    //add a node to the list  
    public void addNode(String name, String fatherName) {  
        //Create a new node  
        Node newNode = new Node(name, fatherName);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.println(current.name + " s/o "+ current.fatherName);  
            current = current.next;  
        }  
    }  
}
public class Personrelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();  
        //Add nodes to the list  
        dl_List.addNode("Tushyap", "Mr. Sunil");  
        dl_List.addNode("Ankit", "mr.Ramesh");  
        dl_List.addNode("Rohan", "Suresh");  
        dl_List.addNode("Naveen", "Ram");  
        dl_List.addNode("saket", "sachin");  
   
        //print the nodes of DoublyLinkedList  
        dl_List.printNodes();  
	}

}
