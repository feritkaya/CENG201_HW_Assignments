import java.util.HashMap;

public class HospitalSystem {
    // lets move classes from other tasks here and combine them

    PatientList ptlist = new PatientList();
    TreatmentQueue tqueue1 = new TreatmentQueue();
    TreatmentQueue urg = new TreatmentQueue();
    DischargeStack dstack = new DischargeStack();

    // using a HashMap for quick searching
    HashMap<Integer, Patient> patientMap = new HashMap<>();

    public void patientAdmission(Patient p) {
        ptlist.addPatient(p);
        patientMap.put(p.id, p);
    }

    public void patientTreatmentRequest(int id, boolean urgency) {
        TreatmentRequest tr = new TreatmentRequest(id, urgency);
        if (urgency) {
            urg.enqueue(tr);
        } else {
            tqueue1.enqueue(tr);
        }
    }

    public void patientDischarge(int id) {
        DischargeRecord dr = new DischargeRecord(id);
        dstack.push(dr);
    }

    public void patientProcess(){
        TreatmentRequest tr;
        if (!urg.isEmpty()) {
            tr = urg.dequeue();
        } else {
            tr = tqueue1.dequeue();
        }

        if (tr == null) {
            System.out.println("No patientprocess.");
            return;
        }

        dstack.push(new DischargeRecord(tr.patientId));
        ptlist.removePatient(tr.patientId);
        patientMap.remove(tr.patientId);
    }
    public void sortingPatients(){
        Patient[] arr = patientMap.values().toArray(new Patient[patientMap.size()]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].severity < arr[j + 1].severity) {
                    Patient temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (Patient p : arr) {
            System.out.println("id: " + p.id + " name: " + p.name + " severity: " + p.severity + " age: " + p.age);
        }
    }

    public void printSystemState() {
        System.out.println("patient in hospital:");
        ptlist.printList();

        System.out.println("urgent queue:");
        urg.printQueue();

        System.out.println("waiting normal queue:");
        tqueue1.printQueue();

        System.out.println("discharge stack:");
        dstack.printStack();
    }


}
