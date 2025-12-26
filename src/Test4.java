public class Test4 {
    public static void main(String[] args) {

        HospitalSystem hs = new HospitalSystem();

        // adding 10 patients
        hs.patientAdmission(new Patient(700, "Elif", 6, 23));
        hs.patientAdmission(new Patient(701, "Ferit", 7, 21));
        hs.patientAdmission(new Patient(702, "Berkay", 14, 22));
        hs.patientAdmission(new Patient(703, "Yağız", 2, 20));
        hs.patientAdmission(new Patient(704, "Faruk", 5, 24));
        hs.patientAdmission(new Patient(705, "Aylin", 9, 26));
        hs.patientAdmission(new Patient(706, "Eren", 1, 30));
        hs.patientAdmission(new Patient(707, "Talim", 3, 50));
        hs.patientAdmission(new Patient(708, "Özgür", 10, 41));
        hs.patientAdmission(new Patient(709, "Mustafa", 4, 47));


        // normal treatment requests
        hs.patientTreatmentRequest(700, false);
        hs.patientTreatmentRequest(701, false);
        hs.patientTreatmentRequest(702, false);
        hs.patientTreatmentRequest(703, false);
        hs.patientTreatmentRequest(704, false);

        // 3 urgent treatment requests
        hs.patientTreatmentRequest(706, true);
        hs.patientTreatmentRequest(709, true);
        hs.patientTreatmentRequest(708, true);

        // discharge 2 patients
        hs.patientDischarge(707);
        hs.patientDischarge(705);


        System.out.println("--- PROCESSING 4 REQUESTS ---");
        hs.patientProcess();
        hs.patientProcess();
        hs.patientProcess();
        hs.patientProcess();


        System.out.println("--- SORTING PATIENTS ---");
        hs.sortingPatients();


        System.out.println("--- FINAL SYSTEM STATE ---");
        hs.printSystemState();

    }

}
