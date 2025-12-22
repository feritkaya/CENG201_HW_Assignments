public class PatientList { // patient list class
    Node head = null; // head of the list
    Node tail = null; // tail of the list

    class Node { // node class
        Patient data;
        Node next;

        Node() {
            this.data = data;
            this.next = null;
        }
    }

    void addPatient(Patient p) { // add patient to the list
        Node eleman = new Node(); // generate new node
        eleman.data = p; // define data

        if (head == null) { // check if the list is empty
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("The first patient was added.");
        } else { // if the list is not empty
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
            System.out.println("Patient added to the list.");
        }
    }

    void removePatient(int id) { // delete patient from the list
        if (head == null) { // check if the list is empty
            System.out.println("The list is empty.");
            return;
        }

        if (head.data.id == id) { // patient deletion from the head node
            head = head.next;
            System.out.println("Patient-ID " + id + " removed from the list.");
            return;
        }

        Node current = head; // traverse and start from the head
        while (current.next != null) { // Continue by checking the next node
            if (current.next.data.id == id) { // If the next node is equal to the searched ID
                if (current.next == tail) {
                    tail = current;
                }

                current.next = current.next.next; // break the link , connect the current node to the new node
                System.out.println("Patient-ID " + id + " removed from the list.");
                return;
            }
            current = current.next; // move on to the next node
        }
        System.out.println("Patient-ID " + id + " wasn't found in the list.");

    }

    Patient findPatient(int id) { // find patient in the list
        Node current = head; // traverse and start from the head
        while (current != null) { // go through all the nodes one by one
            if (current.data.id == id) { //  if the patient is found, print information to the console
                System.out.println("The patient was found ID " + current.data.id);
                System.out.println("ID: " + current.data.id +
                        " - Name: " + current.data.name +
                        " - Severity: " + current.data.severity +
                        " - Age: " + current.data.age
                );
                return current.data;
            }
            current = current.next;
        }
        System.out.println("The patient wasn't found."); // the patient is not on the list.
        return null;
    }

    void printList() {
        Node current = head;
        while (current != null) { // go through all the nodes one by one
            System.out.println( // print patient information to the console
                    "ID: " + current.data.id +
                    " - Name: " + current.data.name +
                    " - Severity: " + current.data.severity +
                    " - Age: " + current.data.age
            );
            current = current.next; // move on to the next node
        }
    }

}

