public class TreatmentRequest { // treatment request class
    int patientId; // patient ID
    long arrivalTime; // arrival time

    public TreatmentRequest(int patientId) { // constructor method
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }
}
