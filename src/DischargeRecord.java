public class DischargeRecord { // discharge record class
    int patientId; // patient id
    long dischargeTime; // discharge time

    // constructor method
    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
}
