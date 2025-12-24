public class TreatmentRequest { // treatment request class
    int patientId; // patient ID
    long arrivalTime; // arrival time
    boolean urgency;

    public TreatmentRequest(int patientId, boolean urgency) { // constructor method
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.urgency = urgency;
    }
}
