public class TreatmentQueue {
    Node front = null; // head
    Node rear = null;  // tail
    int size = 0;

    class Node {
        TreatmentRequest data;
        Node next;

        Node() {
            this.data = null;
            this.next = null;
        }
    }

    void enqueue(TreatmentRequest t2) {
        Node node = new Node();
        node.data = t2;


        if (isEmpty()) {
            front = node;
            rear = node;
            System.out.println("First request added.");
        } else {
            rear.next = node;
            rear = node;
            System.out.println("Request added.");
        }
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    TreatmentRequest dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return null;
        }
        TreatmentRequest current = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
        System.out.println("Request completed and removed from the queue.");
        return current;
    }

    int size() {
        return size;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        Node current = front;
        System.out.println("FRONT");
        while (current != null) {
            System.out.println("Patient ID: " + current.data.patientId + ", arrivalTime: " + current.data.arrivalTime);
            current = current.next;
        }
        System.out.println("REAR");
    }
}