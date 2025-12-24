
public class PatientList {
    // patient list class
    Node head = null; // list's head
    Node tail = null; // list's tail

    // node class
    class Node {
        Patient data;
        Node next;

        Node() {
            this.data = data;
            this.next = null;
        }
    }

    // add patient to list
    void addPatient(Patient p) {
        Node eleman = new Node(); // generate node
        eleman.data = p; // define data

        // list is empty?
        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("first patient was added.");

        // list isn't empty?
        } else {
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
            System.out.println("patient added to list.");
        }
    }

    // delete patient from list
    void removePatient(int id) {
        // list is empty?
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }
        // patient deletion from head
        if (head.data.id == id) {
            head = head.next;
            System.out.println("patient-ID " + id + " removed from list.");
            return;
        }
        //traverse and start from head
        Node current = head;
        while (current.next != null) { // Continue by checking next
            if (current.next.data.id == id) { // if next node is equal to searched ID
                if (current.next == tail)
                    tail = current;

                current.next = current.next.next; // break the link connect current node to new node
                System.out.println("patient-ID " + id + " removed from list.");
                return;
            }
            current = current.next; // move on to next
        }
        System.out.println("patient-ID " + id + " wasn't found in list.");

    }

    // finding patient in list
    Patient findPatient(int id) {
        Node current = head; // traverse and start from the head

        // go all nodes one by one
        while (current != null) {
            if (current.data.id == id) { //  if the patient is found, print information to console
                System.out.println("patient was found ID " + current.data.id);
                System.out.println("ID: " + current.data.id + " - Name: " + current.data.name + " - Severity: " + current.data.severity + " - Age: " + current.data.age);
                return current.data;
            }
            current = current.next;
        }
        System.out.println("patient wasn't found."); // patient isn't on list
        return null;
    }

    void printList() {
        Node current = head;

        // go all nodes one by one
        while (current != null) {
            // print patient information to console
            System.out.println("id: " + current.data.id + " name: " + current.data.name + " severity: " + current.data.severity + " age: " + current.data.age);
            current = current.next; // move on to next
        }
    }

}

