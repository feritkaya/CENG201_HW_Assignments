public class DischargeStack {
    Node top = null;;
    int size = 0;

    class Node {
        DischargeRecord data;
        Node next;

        Node() {
            this.data = null;
            this.next = null;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

    void push(DischargeRecord d1) {
        Node node = new Node();
        node.data = d1;

        if (isEmpty()){
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        size++;
    }

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

    DischargeRecord peek(){
        if (isEmpty()){
            return null;
        }else {
            return top.data;
        }
    }

    void printStack(){
        if (isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        Node current = top;
        while (current != null){
            System.out.println("Patient ID: " + current.data.patientId);
            current = current.next;
        }
    }
}
