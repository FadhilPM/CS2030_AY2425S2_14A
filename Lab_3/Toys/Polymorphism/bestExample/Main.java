import java.util.List;

class Main {

    public static void main(String[] args) { 
        processPayment(List.of(new Card(), new Cash(), new BankTransfer()));
    }

    public static void processPayment(List<Payment> paymentList) {
        for (Payment p : paymentList) {
            System.out.println(p.process());
        }
    }
}
