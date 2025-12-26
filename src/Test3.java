public class Test3 {
    public static void main(String[] args) {

        DischargeStack ds = new DischargeStack();

        ds.push(new DischargeRecord(300));
        ds.push(new DischargeRecord(301));
        ds.push(new DischargeRecord(302));
        ds.push(new DischargeRecord(303));
        ds.push(new DischargeRecord(304));

        ds.printStack();

        ds.pop();
        ds.pop();
        System.out.println();
        System.out.println("-After 2 pops-");
        System.out.println();
        ds.printStack();

    }
}
