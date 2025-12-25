import java.util.HashMap;

public class HospitalSystem {
    // lets move classes from other tasks here and combine them
    PatientList pls = new PatientList();
    TreatmentQueue tqs = new TreatmentQueue();
    TreatmentQueue urg = new TreatmentQueue();
    DischargeStack dss = new DischargeStack();
    // using a HashMap for quick searching
    HashMap<Integer, Patient> patientMap = new HashMap<>();

    public void patientAdmission(Patient p) {
        pls.addPatient(p);
        patientMap.put(p.id, p);
    }

    public void patientTreatmentRequest(int id, boolean urgency) {
        TreatmentRequest tr = new TreatmentRequest(id, urgency);
        if (urgency) {
            urg.enqueue(tr);
        } else {
            tqs.enqueue(tr);
        }
    }

    public void patientDischarge(int id) {
        DischargeRecord dr = new DischargeRecord(id);
        dss.push(dr);
    }

    public void patientProcess(){
        TreatmentRequest tr;
        if (!urg.isEmpty()) {
            tr = urg.dequeue();
        } else {
            tr = tqs.dequeue();
        }

        if (tr == null) {
            System.out.println("No patientprocess.");
            return;
        }

        dss.push(new DischargeRecord(tr.patientId));
        pls.removePatient(tr.patientId);
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
        System.out.println("patient list:");
        pls.printList();

        System.out.println("urgent queue:");
        urg.printQueue();

        System.out.println("normal queue:");
        tqs.printQueue();

        System.out.println("discharge stack:");
        dss.printStack();
    }


}
