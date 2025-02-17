import java.util.List;

class Main {

    public static void main(String[] args) { 
        processPayment(List.of(new Card(), new Cash(), new BankTransfer()));
    }

    public static void processPayment(List<Payment> paymentList) {
        for (Payment p : paymentList) {
            if (p.getId() == 1) {
                System.out.println("Dig wallet for cash");
            } else if (p.getId() == 2) {
                System.out.println("Swipe card");
            } else if (p.getId() == 3) {
                System.out.println("Getting bank account number");
            }
        }
    }
}
