package Stack;

public class StackOrganization {
    private Node head;
    private int sp = -1;
    int size;

    StackOrganization() {
        head = null;
    }
    public int SetSize(int size){
        this.size = size;
        return size;
    }

    public void push(Node n) {
        if (sp < size) {
            if (head == null) {
                head = n;
            } else {
                Node trav;
                trav = head;
                while (trav.next != null) {
                    trav = trav.next;
                }
                trav.next = n;
            }
            sp++;
        }
    }
    public void printList() {
        Node trav = head;
        while (trav != null) {
            System.out.println(trav.al);
            trav = trav.next;
        }
        // System.out.println(sp);
    }

    public void pop(){
        Node trav = head;
        int index = 0;
        while (index < sp-1) {
            trav = trav.next;
            index++;
        }
        System.out.println(trav.al+"**");
        trav.next = null;
        sp--;
    }
}
