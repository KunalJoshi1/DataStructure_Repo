package algorithms.LinkedList;

/**
 * Created by joshik on 11/12/16.
 */
public class LinkListApp {
    public static void main(String[] args) {
        // new instance of the linklist, implementation of methods

        LinkList theList = new LinkList();

        //insert
        theList.insertAtHead(98.0);
        theList.insertAtHead(57);
        theList.insertAtHead(34.2);
        theList.insertAtHead(234);
        theList.insertAtHead(64.34);


        theList.displayList();


        Link aLink = theList.deleteAtHead();
        aLink.displayLink();
        System.out.println(" ");


        theList.delete(00);

        theList.displayList();



    }
}
