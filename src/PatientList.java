public class PatientList {
    Node head = null;
    Node tail = null;

    class Node {
        Patient data;
        Node next;

        Node() {
            this.data = data;
            this.next = null;
        }
    }

    void addPatient(Patient p) {
        Node eleman = new Node();
        eleman.data = p;

        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("The first patient was added.");
        } else {
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
            System.out.println("Patient added to the list.");
        }
    }

    void removePatient(int id) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.data.id == id) {
            head = head.next;
            System.out.println("Patient-ID " + id + " removed from the list.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.id == id) {
                if (current.next == tail) {
                    tail = current;
                }

                current.next = current.next.next;
                System.out.println("Patient-ID " + id + " removed from the list.");
                return;
            }
            current = current.next;
        }
        System.out.println("Patient-ID " + id + " wasn't found in the list.");

    }

    Patient findPatient(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.id == id) {
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
        System.out.println("The patient wasn't found.");
        return null;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(
                    "ID: " + current.data.id +
                    " - Name: " + current.data.name +
                    " - Severity: " + current.data.severity +
                    " - Age: " + current.data.age
            );
            current = current.next;
        }
    }

}

