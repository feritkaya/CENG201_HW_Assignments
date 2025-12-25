public class DischargeStack {
    Node top = null; // stack's top
    int size = 0;

    class Node {
        DischargeRecord data;
        Node next;

        Node() {
            this.data = null;
            this.next = null;
        }
    }
    // checking stack's occupancy
    private boolean isEmpty() {
        return size == 0;
    }

    // push operation
    void push(DischargeRecord d1) {
        Node node = new Node(); // generate node
        node.data = d1; // define data

        if (isEmpty()){
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        size++;
    }

    // pop operation
    DischargeRecord pop(){
        if (isEmpty()){
            return null;
        }else {
            DischargeRecord current = top.data;
            top = top.next;
            size--;
            return current;
        }
    }
    // peek operation
    DischargeRecord peek(){
        if (isEmpty()){
            return null;
        }else {
            return top.data;
        }
    }

    // print stack
    void printStack(){
        if (isEmpty()){
            System.out.println("empty");
            return;
        }

        // traverse and start from the top
        Node current = top;
        while (current != null){
            System.out.println("patient id: " + current.data.patientId);
            current = current.next;
        }
    }
}
