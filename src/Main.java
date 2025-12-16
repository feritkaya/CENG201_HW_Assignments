public class Main {
    public static void main(String[] args) {
        PatientList pl = new PatientList();
        pl.addPatient(new Patient(100, "Atlas", 3, 19));
        pl.addPatient(new Patient(101, "Asım" , 7, 48));
        pl.addPatient(new Patient(102, "Gökçe", 2, 33));
        pl.addPatient(new Patient(103, "Berfu", 6, 26));
        pl.addPatient(new Patient(104, "Derin", 9, 10));

        pl.printList();
        System.out.println();
        pl.removePatient(102);
        System.out.println();
        pl.printList();
        System.out.println();
        pl.findPatient(104);

    }
}