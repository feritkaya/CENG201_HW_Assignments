import java.util.HashMap;

public class HospitalSystem {
    // lets move the classes from other tasks here and combine them
    PatientList patients = new PatientList();
    TreatmentQueue treatmentQueue = new TreatmentQueue();
    TreatmentQueue priorityQueue = new TreatmentQueue(); // for priority patients
    DischargeStack dischargeStack = new DischargeStack();
    // using a HashMap for quick searching
    HashMap<Integer, Patient> patientMap = new HashMap<>();

    void addPatient(Patient p) {
        patients.addPatient(p);
        patientMap.put(p.id, p);
    }



}
