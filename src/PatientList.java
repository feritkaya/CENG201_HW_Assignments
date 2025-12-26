public class PatientList {
    Node1 head = null; // list's head
    Node1 tail = null; // list's tail

    void addPatient(Patient p) {
        Node1 eleman = new Node1(); // generate node
        eleman.data = p; // define data

        // list is empty?
        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;

        // list isn't empty?
        } else {
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;

        }
    }

    void removePatient(int id) {
        // list is empty?
        if (head == null) {
            return;
        }
        if (head.data.id == id) {
            head = head.next;
            System.out.println("patient id " + id + " removed");
            return;
        }
        //traverse and start from head
        Node1 current = head;
        while (current.next != null) {
            if (current.next.data.id == id) {
                if (current.next == tail)
                    tail = current;

                current.next = current.next.next;
                System.out.println("patient id " + id + " removed");
                return;
            }
            current = current.next; // move on to next
        }
        System.out.println("patient id " + id + " not found");

    }

    Patient findPatient(int id) {
        Node1 current = head; // traverse and start from the head
        // go all nodes one by one
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("found patient id " + current.data.id);
                System.out.println("id: " + current.data.id + " name: " + current.data.name + " severity: " + current.data.severity + " age: " + current.data.age);
                return current.data;
            }
            current = current.next;
        }
        System.out.println("patient not found"); // patient isn't on list
        return null;
    }

    void printList() {
        Node1 current = head;

        // go all nodes one by one
        while (current != null) {
            System.out.println("id: " + current.data.id + " name: " + current.data.name + " severity: " + current.data.severity + " age: " + current.data.age);
            current = current.next; // move on to next
        }
    }

}

