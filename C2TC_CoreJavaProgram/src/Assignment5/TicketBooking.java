package Assignment5;

class TicketBooking {
    private String stageEvent;
    private String customer;
    private int noOfSeats;

    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public void printReceipt() {
        System.out.println("Stage Event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of Seats: " + noOfSeats);
    }

    public void makePayment(int amount) {
        System.out.println("Payment done using Cash");
        System.out.println("Amount: ₹" + amount);
    }

    public void makePayment(int amount, String walletNumber) {
        System.out.println("Payment done using Wallet");
        System.out.println("Wallet Number: " + walletNumber);
        System.out.println("Amount: ₹" + amount);
    }

    public void makePayment(String holderName, int amount, String cardType, String ccv) {
        System.out.println("Payment done using Credit Card");
        System.out.println("Card Holder: " + holderName);
        System.out.println("Card Type: " + cardType);
        System.out.println("CCV: " + ccv);
        System.out.println("Amount: ₹" + amount);
    }
}