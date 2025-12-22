public class DischargeRecord { // discharge record class
    int patientId; // patient ID
    long dischargeTime; // discharge time in milliseconds

    public DischargeRecord(int patientId) { // constructor method
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
}
