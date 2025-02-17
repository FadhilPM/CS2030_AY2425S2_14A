import java.util.List;

class Main {

    public static void main(String[] args) { 
        processPayment(List.of(new Card(), new Cash(), new BankTransfer(), new QR()));
    }

    public static void processPayment(List<Payment> paymentList) {
        for (Payment p : paymentList) {
            p.process();
        }
    }
}
