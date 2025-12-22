public class DischargeStack { // discharge stack class
    Node top = null;;// top of stack
    int size = 0;

    class Node { // node class
        DischargeRecord data;
        Node next;

        Node() {
            this.data = null;
            this.next = null;
        }
    }

    private boolean isEmpty() { // check the occupancy of the stack
        return size == 0;
    }

    void push(DischargeRecord d1) { // push operation
        Node node = new Node(); // generate new node
        node.data = d1; // define data

        if (isEmpty()){
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        size++;
    }

    DischargeRecord pop(){ // pop operation
        if (isEmpty()){
            return null;
        }else {
            DischargeRecord current = top.data;
            top = top.next;
            size--;
            return current;
        }
    }

    DischargeRecord peek(){ // peek operation
        if (isEmpty()){
            return null;
        }else {
            return top.data;
        }
    }

    void printStack(){ // print stack
        if (isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        Node current = top; // traverse and start from the top
        while (current != null){
            System.out.println("Patient ID: " + current.data.patientId);
            current = current.next;
        }
    }
}
