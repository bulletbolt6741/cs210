package cs210_lab8_3;

class DoublyLinkedList {
    private DoublyLink head;
    private DoublyLink tail; 

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    public void add(String name, int age, String degree, int yearOfStudy) {
        DoublyLink newLink = new DoublyLink(name, age, degree, yearOfStudy);
        if (head == null) {
            head = tail = newLink; 
        } else {
            tail.next = newLink;
            newLink.prev = tail; 
            tail = newLink;
        }
    }
    public void printList() {
        DoublyLink current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
    public void createLoop(int position) {
        if (head == null || position <= 0) return;

        DoublyLink current = head;
        DoublyLink loopLink = null;
        int index = 1;

        while (current != null) {
            if (index == position) {
                loopLink = current;
            }
            if (current.next == null) {
                break;
            }
            current = current.next;
            index++;
        }

        if (loopLink != null) {
            current.next = loopLink;
            loopLink.prev = current;
            System.out.println(loopLink.name+" a "+current.name);
        }
    }

    public void removeLoop() {
        DoublyLink slow = head, fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.name+fast.name);
            if (slow == fast) {
                break;
            }
        }

        
        if (fast == null || fast.next == null) {
            System.out.println("No loop detected.");
            return;
        }

        
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        
        DoublyLink loopLink = slow;
        System.out.println("Loop detected at: " + loopLink.name);

       
        DoublyLink current = loopLink;
        while (current.next != loopLink) {
            current = current.next;
        }
        current.next = null; 
        System.out.println("Loop removed.");
    }
}

