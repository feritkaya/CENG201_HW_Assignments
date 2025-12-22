public class TreatmentQueue {
    Node front = null; // head of the queue
    Node rear = null;  // tail of the queue
    int size = 0;

    class Node { // node class
        TreatmentRequest data;
        Node next;

        Node() {
            this.data = null;
            this.next = null;
        }
    }

    void enqueue(TreatmentRequest t2) {
        Node node = new Node(); // generate new node
        node.data = t2; // define data


        if (isEmpty()) { // check if the queue is empty
            front = node; // the newly added element becomes both front and rear
            rear = node;
            System.out.println("First request added.");
        } else { // the next reference of the current last element links to the new node
            rear.next = node;
            rear = node;
            System.out.println("Request added.");
        }
        size++;
    }

    private boolean isEmpty() { // check the occupancy of the queue
        return size == 0;
    }

    TreatmentRequest dequeue() {
        if (isEmpty()) { // check if the queue is empty
            System.out.println("The queue is empty.");
            return null;
        }
        TreatmentRequest current = front.data; // assign the data(front) to a temporary variable
        front = front.next; // move the front to the next node
        size--; // reduce the size

        // ıf the last element is removed and front becomes null, rear must also be null
        if (front == null) {
            rear = null;
        }
        System.out.println("Request completed and removed from the queue.");
        return current;
    }

    int size() { // return the size of the queue
        return size;
    }

    void printQueue() {
        if (isEmpty()) { // check if the queue is empty
            System.out.println("The queue is empty.");
            return;
        }
        Node current = front; // traverse and start from the front
        System.out.println("FRONT");
        while (current != null) { // go through all the nodes one by one
            // print the data of the current node
            System.out.println("Patient ID: " + current.data.patientId + ", arrivalTime: " + current.data.arrivalTime);
            current = current.next; // move on to the next node
        }
        System.out.println("REAR");
    }
}