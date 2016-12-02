package algorithms.LinkedList;

/**
 * Created by joshik on 11/12/16.
 */
public class LinkList {

    // head, linklist constructor, methods: insert, delete, search, sort

    private Link head;

    public LinkList(){
        head = null;
    }

    //boolean isEmpty
    public boolean isEmpty(){
        return (head == null);
    }

    // insertAtHead
    public void insertAtHead(double data){
        Link newL = new Link(data);
        newL.next = head;
        head = newL;
    }

    // deleteAtHead
    public Link deleteAtHead(){
        Link temp = head; //store the 1st link value in a temp variable to return after deletion
        head = head.next;
        return temp;
    }

    // displayList
    public void displayList(){
        Link current = head;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    // search
    public Link find(int sKey){

        Link current = head;
        while (current.data != sKey){
            if(current.next == null){
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }

    // delete
    public Link delete(int sKey){

        Link a1 = head;
        Link a2 = head;

        while(a1.data != sKey){
            if(a1.next == null){
                System.out.println("Skey not found");
                return null;
            } else {
                a2 = a1;
                a1 = a1.next; // moving on
            }
        }

        if(a1 == head){
            head = head.next;
        } else{
            a2.next = a1.next;
        }

        return a1;

    }


}
