public class TreatmentQueue {
    Node2 front = null; // queue's head
    Node2 rear = null;  // queue's tail
    int size = 0;

    void enqueue(TreatmentRequest t2) {
        Node2 node = new Node2(); // generate node
        node.data = t2; // define data

        // queue is empty?
        if (isEmpty()) {
            front = node; // new added element becomes both front and rear
            rear = node;

        // current last element's next reference  links to new node
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    // checking queue's occupancy
    public boolean isEmpty() {
        return size == 0;
    }

    TreatmentRequest dequeue() {
        // queue is empty?
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }
        // assigning front to temporary variable
        TreatmentRequest current = front.data;
        front = front.next; // move front to next node
        size--; // reduce size

        // ıf last element is removed and front becomes null
        // rear must be null
        if (front == null) {
            rear = null;
        }

        return current;
    }

    int size() { // return queue's size
        return size;
    }

    void printQueue() {
        // queue is empty?
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        // traverse and start from front
        Node2 current = front;
        System.out.println("front");

        // go all nodes one by one
        while (current != null) {
            // print current node's data
            System.out.println("patient id: " + current.data.patientId + " arrivaltime: " + current.data.arrivalTime);
            current = current.next; // move on to next node
        }
        System.out.println("rear");
    }
}