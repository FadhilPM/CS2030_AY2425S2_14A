import java.util.List;

class Main {

    public static void main(String[] args) { 
        processPayment(List.of(new Card(), new Cash(), new BankTransfer()));
    }

    public static void processPayment(List<Payment> paymentList) {
        for (Payment p : paymentList) {
            if (p instanceof Cash) {
                System.out.println("Dig wallet for cash");
            } else if (p instanceof Card) {
                System.out.println("Swipe card");
            } else if (p instanceof BankTransfer) {
                System.out.println("Getting bank account number");
            }
        }
    }
}
