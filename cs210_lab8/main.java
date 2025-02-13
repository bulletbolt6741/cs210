package cs210_lab8_3;

public class main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add("Link 1", 19, "CS", 1);
        list.add("Link 2", 20, "CS", 1);
        list.add("Link 3", 23, "CS", 3);
        list.add("Link 4", 21, "CS", 2);
        list.add("Link 5", 22, "CS", 2);
        list.add("Link 6", 26, "CS", 3);

        //creates loop at position 3
        list.createLoop(3);
        //removes loop
        list.removeLoop();

        //prints fixed list
        list.printList();
    }
}

