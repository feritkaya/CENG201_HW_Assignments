public class Test2 {
    public static void main(String[] args) {

        TreatmentQueue tq = new TreatmentQueue();

        tq.enqueue(new TreatmentRequest(110,true));
        tq.enqueue(new TreatmentRequest(111,false));
        tq.enqueue(new TreatmentRequest(112,true));
        tq.enqueue(new TreatmentRequest(113,false));
        tq.enqueue(new TreatmentRequest(114,true));
        tq.enqueue(new TreatmentRequest(115, true));
        tq.enqueue(new TreatmentRequest(116, false));
        tq.enqueue(new TreatmentRequest(117, false));
        System.out.println("-Queue after 8 enqueues-");
        tq.printQueue();

        System.out.println("-After 3 dequeues-");
        tq.dequeue();
        tq.dequeue();
        tq.dequeue();

        tq.printQueue();

    }
}
